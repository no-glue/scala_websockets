import com.pmeade.websocket.io.WebSocketServerOutputStream
import com.pmeade.websocket.net.WebSocket
import com.pmeade.websocket.net.WebSocketServerSocket
import com.pmeade.websocket.example.WebSocketConsumerThread
import com.pmeade.websocket.example.StringMessageQueue
import com.pmeade.websocket.example.WebSocketThread
import java.io.IOException
import java.io.InputStream
import java.net.ServerSocket
import java.util.Iterator
import java.util.LinkedList
import java.util.ListIterator
import java.util.Queue
import java.util.Arrays

object Websockets {
  val PORT:Int = 8080
  def main(args: Array[String]) = {
    try {
      doIt()
    } catch {
      case e: Exception => print("exception happened. exiting. " + e.getLocalizedMessage() + ".")
    }
  }
  @throws(classOf[Exception])
  def doIt() = {
    val serverSocket: ServerSocket = new ServerSocket(PORT)
    val webSocketServerSocket: WebSocketServerSocket = new WebSocketServerSocket(serverSocket)
    val messageQueue: StringMessageQueue = new StringMessageQueue()
    val connections: LinkedList[WebSocket] = new LinkedList[WebSocket]()
    new WebSocketConsumerThread(messageQueue, connections).start()
    while(true) {
      var socket: WebSocket = webSocketServerSocket.accept()
      connections.add(socket)
      new WebSocketThread(socket, messageQueue).start()
    }
    println("Hi!")
  }
}
