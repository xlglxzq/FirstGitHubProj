package goods;
/**
 * ��Ʒ��
 * @author GaoX
 *
 */
public class Goods {

	String no;//��Ʒ���  ��Ա����
	String name;//��Ʒ����
	float price;//��Ʒ�۸�
	int count;//�����
	public Goods(String no,String name,float price,int count){// �ֲ�����
		this.no=no;
		this.name=name;
		this.price=price;
		this.count=count;
	}
	
    public Goods(){
		
	}
	public  void showInfo(){
		System.out.println(no+"\t"+name+"\t"+price+"Ԫ\t"+count+"��");
	}
}
