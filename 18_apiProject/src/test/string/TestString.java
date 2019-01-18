/*package test.string;

import java.util.StringTokenizer;

public class TestString {
	
	public static void main(String[] args) {
		// 湲곕낯 String �꽑�뼵 諛� 議곗옉
		String str = "�쑀蹂묒듅";
		System.out.println(str.hashCode());
		str += "泥쒖옱";
		System.out.println(str.hashCode());
		System.out.println(str);
		// 臾몄옄�뿴�쓣 �옒�씪�궡�뒗 湲곕뒫
		String gen = str.substring(1, 3);
		System.out.println(gen);
		// 臾몄옄�뿴�쓣 蹂�寃쏀빐二쇰뒗 湲곕뒫
		String �삤�룎堉� = str.replace("蹂묒듅", "�옱誘�");
		System.out.println(�삤�룎堉�);
		
		// �빐�떦 臾몄옄 �쐞移� 寃��깋
		System.out.println(str.indexOf("泥�"));
		�삤�룎堉� = "�옱誘쇱옱誘쇱옱誘�";
		System.out.println(�삤�룎堉�.indexOf("�옱"));
		System.out.println(�삤�룎堉�.lastIndexOf("�옱"));
		//臾몄옄�뿴�쓣 �듅�젙臾몄옄濡� 援щ텇�븯�뿬 諛곗뿴濡� 蹂��솚
		String temp = "�쑀蹂묒듅,�떊�옱誘�,�젙�슦吏�,�쑄以��쁺,諛뺤쭊�슦";
		String[] name = temp.split(",");
		for (String a : name) {
			System.out.println(a);
		}
		
		// 臾몄옄�뿴 �썝蹂� 蹂�寃쎌씠 媛��뒫�븳 StringBuffer <-> String�� �븿�닔 諛섑솚 媛� return 諛쏆븘�꽌 ���옣
		StringBuffer sb = new StringBuffer("�븘由ъ븘由�");
		System.out.println(sb);
		System.out.println(sb + "" + sb.hashCode());
		sb.append("�븯�븯");
		System.out.println(sb + "" + sb.hashCode());
		sb.insert(0, "�슂湲�");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		sb = new StringBuffer(temp);
		sb.replace(0, 2, "蹂묒듅");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer(temp, ",");
		// 臾댁옉�쐞濡� �씤�뜳�뒪 �뾾�씠 ���옣�씠 �릺�뼱 �엳�뼱�꽌
		// StringTokenizer媛� �젣怨듯븯�뒗 硫붿냼�뱶瑜� �씠�슜�빐�꽌 �뜲�씠�꽣瑜� 媛��졇���빞�븿. �뿬�윭 臾몄옄�씠湲� �븣臾몄뿉 諛섎났臾몄쓣 �넻�빐 �뜲�씠�꽣瑜� 媛��졇�샂
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		while(st.hasMoreTokens()) {
			String name1 = st.nextToken() + " ";
			System.out.print(name1); 
			// System.out.println(st.nextToken() + " ");
		}
		System.out.println();
		
	}
}
*/