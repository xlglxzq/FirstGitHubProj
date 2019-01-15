package goods;
/**
 * 商品类
 * @author GaoX
 *
 */
public class Goods {

	String no;//商品编号  成员变量
	String name;//商品名称
	float price;//商品价格
	int count;//库存量
	public Goods(String no,String name,float price,int count){// 局部变量
		this.no=no;
		this.name=name;
		this.price=price;
		this.count=count;
	}
	
    public Goods(){
		
	}
	public  void showInfo(){
		System.out.println(no+"\t"+name+"\t"+price+"元\t"+count+"个");
	}
}
