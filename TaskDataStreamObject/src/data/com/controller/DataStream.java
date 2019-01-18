package data.com.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.com.vo.Product;

public class DataStream {

	public void addFile() {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.bat"))) {
			Product[] products = new Product[5];
			products[0] = new Product("텀블러", 2000, 2, 0.2);
			products[1] = new Product("노트북", 3000, 3, 0.3);
			products[2] = new Product("마우스", 4000, 4, 0.4);
			products[3] = new Product("키보드", 5000, 5, 0.5);
			products[4] = new Product("모니터", 6000, 6, 0.6);
			oos.writeObject(products);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.bat"))) {
			Product[] products = (Product[]) ois.readObject();
			for (Product p : products) {
				System.out.println(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cfe) {
			cfe.printStackTrace();
		}
	}
}
