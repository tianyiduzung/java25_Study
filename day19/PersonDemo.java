/*
װ�����ģʽ��
����Ҫ�����еĶ�����й�����ǿʱ��
���Զ����࣬�����ж����룬�������еĹ��ܣ����ṩ��ǿ���ܡ�
��ô�Զ���ĸ����Ϊװ���ࡣ

װ����ͨ����ͨ�����췽�����ձ�װ�εĶ���
�����ڱ�װ�ε������Ĺ��ܣ��ṩ��ǿ�Ĺ��ܡ�

*/

class Person
{
	public void chifan()
	{
		System.out.println("�Է�");
	}
}

class SuperPerson
{
	private Person p;
	SuperPerson(Person p)
	{
		this.p=p;
	}
	public void superChifan()
	{
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
		System.out.println("��һ��");
	}
}

class  PersonDemo
{
	public static void main(String[] args) 
	{
		Person p=new Person();
		//p.chifan();

		SuperPerson sp=new SuperPerson(p);
		sp.superChifan();
	}
}