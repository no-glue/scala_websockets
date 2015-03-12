import com.pmeade.websocket.io.WebSocketServerOutputStream;
import com.pmeade.websocket.net.WebSocket;
import com.pmeade.websocket.net.WebSocketServerSocket;
import com.pmeade.websocket.example.WebSocketConsumerThread;
import com.pmeade.websocket.example.StringMessageQueue;
import com.pmeade.websocket.example.ByteAccumulator;
import com.pmeade.websocket.example.WebSocketThread;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Arrays;

object Websockets {
  val PORT:Int = 8080
  def main(args: Array[String]) = println("Hi!")
}
