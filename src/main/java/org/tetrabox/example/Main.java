package org.tetrabox.example;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

import org.tetrabox.example.server.exceptions.CustomAnnotationsErrorResolver;
import org.tetrabox.example.server.lrp.ILRPHandler;
import org.tetrabox.example.server.lrp.LRPHandler;

import com.googlecode.jsonrpc4j.JsonRpcServer;
import com.googlecode.jsonrpc4j.StreamServer;

public class Main {
	private static final int MAX_THREADS = 5;
	private static final String HOST_NAME = "localhost";
	private static final int PORT = 49152;
	private static final int BACKLOG = 10;

	private static StreamServer streamServer;

	public static void main(String[] args) throws IOException {
		InetAddress bindAddress = InetAddress.getByName(HOST_NAME);
		ILRPHandler lrpHandler = new LRPHandler();
		ServerSocket serverSocket = new ServerSocket(PORT, BACKLOG, bindAddress);

		JsonRpcServer jsonRpcServer = new JsonRpcServer(lrpHandler, ILRPHandler.class);
		jsonRpcServer.setErrorResolver(CustomAnnotationsErrorResolver.getInstance());
		streamServer = new StreamServer(jsonRpcServer, MAX_THREADS, serverSocket);
		streamServer.start();

		System.out.println(
				"Server running at " + serverSocket.getInetAddress() + ", port " + serverSocket.getLocalPort() + "...");
	}
}
