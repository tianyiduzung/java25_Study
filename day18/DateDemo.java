
import java.util.*;
import java.text.*;
class  DateDemo
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d);//打印的时间看不懂，希望有些格式。

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 E hh:mm:ss");

		//调用format方法让模式格式化指定Date对象
		String time=sdf.format(d);
		System.out.println("time="+time);
	}
}
