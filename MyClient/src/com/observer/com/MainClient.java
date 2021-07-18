package com.observer.com;

public class MainClient {

	public static void main(String[] args) {
		TcpClient c1 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c1.connect("127.0.0.1", 1234);
		delay(3);
		TcpClient c2 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c2.connect("127.0.0.2", 1234);
		delay(3);
		TcpClient c3 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c3.connect("127.0.0.3", 1234);
		delay(3);
		TcpClient c4 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c4.connect("127.0.0.4", 1234);
		delay(3);
		TcpClient c5 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c5.connect("127.0.0.5", 1234);
		delay(3);
		TcpClient c6 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c6.connect("127.0.0.6", 1234);
		delay(3);
		TcpClient c7 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c7.connect("127.0.0.7", 1234);
		TcpClient c8 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c8.connect("127.0.0.8", 1234);
		TcpClient c9 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c9.connect("127.0.0.9", 1234);
		TcpClient c10 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c10.connect("127.0.0.10", 1234);
		delay(3);
		TcpClient c11 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c11.connect("127.0.0.11", 1234);
		delay(3);
		TcpClient c12 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c12.connect("127.0.0.12", 1234);
		delay(3);
		TcpClient c13 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c13.connect("127.0.0.13", 1234);
		delay(3);
		TcpClient c14 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c14.connect("127.0.0.14", 1234);
		delay(3);
		TcpClient c15 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c15.connect("127.0.0.15", 1234);
		delay(3);
		TcpClient c16 = new TcpClient() {

			@Override
			public void onReceive(SocketTransceiver st, String s) {
				System.out.println("Client1 Receive: " + s);
			}

			@Override
			public void onDisconnect(SocketTransceiver st) {
				System.out.println("Client1 Disconnect");
			}

			@Override
			public void onConnect(SocketTransceiver transceiver) {
				System.out.println("Client1 Connect");
			}

			@Override
			public void onConnectFailed() {
				System.out.println("Client1 Connect Failed");
			}
		};
		c16.connect("127.0.0.16", 1234);


//		c1.disconnect();

//		while (true) {
//			if (c1.isConnected()) {
//				c1.getTransceiver().send("Hello1");
//			} else {
//				break;
//			}
//			delay();
//			if (c2.isConnected()) {
//				c2.getTransceiver().send("Hello2");
//			} else {
//				break;
//			}
//			delay();
//		}
	}

	static void delay(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
