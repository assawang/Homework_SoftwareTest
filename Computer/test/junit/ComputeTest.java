package junit;

import computer.Compute;
import junit.framework.Assert;
import junit.framework.TestCase;

public class ComputeTest extends TestCase{
	
	public void testAdd()
    {
   
        int result = Compute.add(1, 2);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(3, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ
    }

    public void testSubtract()
    {
        int result = Compute.subtract(1, 2);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(-1, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ

    }

    public void testMultiply()
    {
        int result = Compute.multiply(2, 3);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(6, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ

    }

    public void testDivide()
    {
        int result = Compute.divide(12, 3);
        // �жϷ����ķ��ؽ��
        Assert.assertEquals(4, result);// ��һ������������ֵ���ڶ���������Ҫ��֤��ֵ

    }



}
