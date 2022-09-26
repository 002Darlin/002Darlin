package UseMethod;

import java.util.*;

public class TestRandom
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		//生成一个随机的bool数值
		System.out.println("rand.nextBoolean()：" + rand.nextBoolean());
		//创建一个包容16个元素的字节数组，使用随机数填充
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//生成0.0~1.0之间的伪随机double数
		System.out.println("rand.nextDouble()：" + rand.nextDouble());
		//生成0.0~1.0之间的伪随机float数
		System.out.println("rand.nextFloat()：" + rand.nextFloat());
		//生成平均值是 0.0，标准差是 1.0的伪高斯数
		System.out.println("rand.nextGaussian()：" + rand.nextGaussian());
		//生成一个处于long整数取值范围的伪随机整数
		System.out.println("rand.nextInt()：" + rand.nextInt());
		//生成0~26之间的伪随机整数
		System.out.println("rand.nextInt(26)：" + rand.nextInt(26));
		//生成一个处于long整数取值范围的伪随机整数
		System.out.println("rand.nextLong()：" +  rand.nextLong());
	}
}
