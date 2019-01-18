package com.network.info;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {

	public static void main(String[] args) throws UnknownHostException {
		// 로컬호스트에 대한 정보를 불러오는것 
		InetAddress localIP = InetAddress.getLocalHost();
		System.out.println(localIP.getHostName());
		System.out.println(localIP.getHostAddress());
		
		//naver.com 주소의 정보를 얻어보자
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println(naver.getHostName());
		System.out.println(naver.getHostAddress());
		
		InetAddress daum = InetAddress.getByName("www.daum.net");
		System.out.println(daum.getHostName());
		System.out.println(daum.getHostAddress());
		
		InetAddress[] google = InetAddress.getAllByName("www.google.com");
		System.out.println(google.length);
		
		for (InetAddress a : google) {
			System.out.println(a.getHostAddress());
		}
	}

}
