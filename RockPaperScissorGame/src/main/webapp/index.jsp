<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
    <title>Rock Paper Scissors Game</title>
    <style>
        .win {
            background-color: cyan;
        }
        .lose {
            background-color: green;
        }
        .tie {
            background-color: yellow;
        }
        .default {
            background-color: white;
        }
    </style>
</head>
<body class="${bgColor}">
    <h1>Rock Paper Scissors Game</h1>
    <form action="GameServlet" method="post">
        <label>Select your move:</label><br>
        <input type="radio" id="rock" name="userMove" value="r" required>
        <label for="rock">Rock</label><br>
        <input type="radio" id="paper" name="userMove" value="p">
        <label for="paper">Paper</label><br>
        <input type="radio" id="scissors" name="userMove" value="s">
        <label for="scissors">Scissors</label><br><br>
        <input type="submit" value="Play">
    </form>
    <br>
    <p>${message}</p>
    <h3>${result}</h3>
    <form action="index.jsp" method="post">
        <input type="submit" value="Play Again">
    </form>
</body>
</html>