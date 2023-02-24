package org.tetrabox.example;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

import org.tetrabox.example.server.ILRPHandler;
import org.tetrabox.example.server.LRPHandler;
import org.tetrabox.example.server.exceptions.CustomAnnotationsErrorResolver;

import com.googlecode.jsonrpc4j.JsonRpcServer;
import com.googlecode.jsonrpc4j.StreamServer;

public class Main {
	private static final int MAX_THREADS = 5;
	private static final String HOST_NAME = "localhost";
	private static int port;
	private static final int BACKLOG = 10;

	private static StreamServer streamServer;

	public static void main(String[] args) throws IOException {
		if (args.length == 0)
			throw new IllegalArgumentException("Expected a server port as argument.");

		port = Integer.parseInt(args[0]);

		InetAddress bindAddress = InetAddress.getByName(HOST_NAME);
		ILRPHandler lrpHandler = new LRPHandler();
		ServerSocket serverSocket = new ServerSocket(port, BACKLOG, bindAddress);

		JsonRpcServer jsonRpcServer = new JsonRpcServer(lrpHandler, ILRPHandler.class);
		jsonRpcServer.setErrorResolver(CustomAnnotationsErrorResolver.getInstance());
		streamServer = new StreamServer(jsonRpcServer, MAX_THREADS, serverSocket);
		streamServer.start();

		System.out.println(
				"Server running at " + serverSocket.getInetAddress() + ", port " + serverSocket.getLocalPort() + "...");
	}
}
