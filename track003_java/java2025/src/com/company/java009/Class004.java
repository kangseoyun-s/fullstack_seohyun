package com.company.java009;

class Product{
String name;
int price;
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + "]";
}
public Product(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
}
public class Class004 {
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1);
	}

}
/* [runtime data area]
 * -----------------------------
 * [method: 정보, static, final : 공용 정보]
 *  MyPrice001.class, ClassEx002.class       클래스(설계도)           
 * -----------------------------             객체(p1) 인스턴스(p1.name="apple"/p1.price=1500)                                                         
 * [heap : 동적]      | [stack: 빌리기]     product p1 = new Product();
 *                                         p1.(){}
 * 1번지                                    
 * {name=null, price=0,} < p1 [1번지]           
 *         
 *                  | main   
 * ------------------------------                      
 */
