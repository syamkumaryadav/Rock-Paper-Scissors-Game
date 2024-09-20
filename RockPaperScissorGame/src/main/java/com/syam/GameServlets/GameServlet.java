package com.syam.GameServlets;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userMove = request.getParameter("userMove");
        String[] rps = {"r", "p", "s"};
        Random random = new Random();
        String computerMove = rps[random.nextInt(3)];
        
        String message = "Computer move: " + moveToString(computerMove) + ".\n Your move: " + moveToString(userMove) + ".";
        String result;
        String bgColor;

        if (userMove.equals(computerMove)) {
            result = "It's a tie!";
            bgColor = "tie";
        } else if (userWins(userMove, computerMove)) {
            result = "You win!";
            bgColor = "win";
        } else {
            result = "You lose!";
            bgColor = "lose";
        }
        
        request.setAttribute("message", message);
        request.setAttribute("result", result);
        request.setAttribute("bgColor", bgColor);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    
    private boolean userWins(String userMove, String computerMove) {
        return (userMove.equals("r") && computerMove.equals("s")) ||
               (userMove.equals("p") && computerMove.equals("r")) ||
               (userMove.equals("s") && computerMove.equals("p"));
    }
    asdfghjkl;';lkjhgfdsasdfghjklkjhgfds
    private String moveToString(String move) {
        switch (move) {
            case "r":
                return "Rock";
            case "p":
                return "Paper";
            case "s":
                return "Scissors";
            default:
                return "";
        }
    }
}


