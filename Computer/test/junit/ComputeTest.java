package junit;

import computer.Compute;
import junit.framework.Assert;
import junit.framework.TestCase;

public class ComputeTest extends TestCase{
	
	public void testAdd()
    {
   
        int result = Compute.add(1, 2);
        // 判断方法的返回结果
        Assert.assertEquals(3, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    public void testSubtract()
    {
        int result = Compute.subtract(1, 2);
        // 判断方法的返回结果
        Assert.assertEquals(-1, result);// 第一个参数是期望值，第二个参数是要验证的值

    }

    public void testMultiply()
    {
        int result = Compute.multiply(2, 3);
        // 判断方法的返回结果
        Assert.assertEquals(6, result);// 第一个参数是期望值，第二个参数是要验证的值

    }

    public void testDivide()
    {
        int result = Compute.divide(12, 3);
        // 判断方法的返回结果
        Assert.assertEquals(4, result);// 第一个参数是期望值，第二个参数是要验证的值

    }



}
