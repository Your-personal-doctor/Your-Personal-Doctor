<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>chatroom</title>
        <script type="text/javascript">
            // Create a WebSocket
            var webSocket = new WebSocket("ws://localhost:8080/TestWebSocket/chat");
            var sendMsg = function () {
                var inputElement = document.getElementById('msg');
                if (inputElement.value == '')
                    alert(" ");
                else {
                    // send message
                    webSocket.send(inputElement.value);
                    //clean text area
                    inputElement.value = "";
                }
            }
            var send = function (event) {
                //using Enter to send message
                if (event.keyCode == 13) {
                    sendMsg();
                }
            };
            webSocket.onopen = function () {
                n = prompt('pick up a name：');
                if (n != '' && n != null)
                    webSocket.send(n);
                else
                    //user 
                    webSocket.send("user" + Math.random() * 100000000000);
                document.getElementById('msg').onkeydown = send;
                document.getElementById('sendBn').onclick = sendMsg;
            };
            // through onmessage to receive message, and show the message
            webSocket.onmessage = function (event) {
                var show = document.getElementById('show')
                show.innerHTML += new Date() + "<br/>" + event.data + "<br/>";
                show.scrollTop = show.scrollHeight;
            }
            webSocket.onclose = function () {
                document.getElementById('msg').onkeydown = null;
                document.getElementById('sendBn').onclick = null;
                Console.log('WebSocket closed');
            };
        </script>
    </head>
    <body>
        <div
            style="width: 600px; height: 240px; overflow-y: auto; border: 1px solid #333;"id="show"></div>
        <input type="text" size="80" id="msg" name="msg" placeholder="Type text here" />
        <input type="button" value="send" id="sendBn" name="sendBn" />
    </body>
</html>
