package data.com.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import data.com.vo.Product;

public class DataStream {

	public void addFile() {

		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("product.dat"))){
			// String name, double price, int count, double discountRate
			Product[] products = new Product[5];
			products[0] = new Product("텀블러", 2000, 2, 0.2);
			products[1] = new Product("노트북", 3000, 3, 0.3);
			products[2] = new Product("마우스", 4000, 4, 0.4);
			products[3] = new Product("키보드", 5000, 5, 0.5);
			products[4] = new Product("모니터", 6000, 6, 0.6);
			for (int i = 0; i < 5; i++) {
				dos.writeUTF(products[i].getName());
				dos.writeDouble(products[i].getPrice());
				dos.writeInt(products[i].getCount());
				dos.writeDouble(products[i].getDiscountRate());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void printFile() {
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("product.dat"))){
			Product[] products = new Product[5];
			/*for (int i = 0; i < 5; i++) {
				System.out.println("제품명 : " + dis.readUTF());
				System.out.println("가격 : " + dis.readDouble());
				System.out.println("수량 : " + dis.readInt());
				System.out.println("할인율 : " + dis.readDouble());
			}*/
			
			/*for (int i = 0; i < 5; i++) {
				products[i] = new Product();
				products[i].setName(dis.readUTF());
				products[i].setPrice(dis.readDouble());
				products[i].setCount(dis.readInt());
				products[i].setDiscountRate(dis.readDouble());
			}*/
			
			for (int i = 0; i < 5; i++) {
				products[i] = new Product(dis.readUTF(), dis.readDouble(), dis.readInt(), dis.readDouble());
			
			}
			System.out.println("=== 저장 물품 ===");
			
			for (int i = 0; i < 5; i++) {
				System.out.println("제품명 : " + products[i].getName());
				System.out.println("가격 : " + products[i].getPrice());
				System.out.println("수량 : " + products[i].getCount());
				System.out.println("할인율 : " + products[i].getDiscountRate());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
