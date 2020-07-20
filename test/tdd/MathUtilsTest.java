/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static anhplp.util.MathUtils.computeFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author theFrozenAdam
 */
public class MathUtilsTest {

    @Test //báo cho JVM biết rằng đây là hàm main
    //trong hàm này chạy các lệnh để test code chính của mình ở bên MathUtil
    //ta test các tình huống thành công: -cF(5) = 120 => Good
    public void testSuccessfulCases() {
        //assertEquals(30, 50); //kì vọng 30 nhưng actual là 50 -> nếu khớp thì báo về màu xanh còn không khớp báo về màu đỏ
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(0));
        assertEquals(1, computeFactorial(1));
        assertEquals(2, computeFactorial(2));
        //muốn xanh thì tất cả phải xanh => vì viết code đúng thì sẽ đúng trong mọi trường hợp
        //còn cả đám xanh có 1 thằng đỏ => đỏ cả lũ vì có 1 thằng sai
    }

    @Test(expected = IllegalArgumentException.class) //annotation báo cho JVM và thư viện liên quan phải làm gì
    //hàm này chứ những tình huống sai cF(-5), cF(16)
    public void testFailedCases() {
        //kì vọng return 1 exception => code chạy ổn
        //exception không phải là 1 value để so sanh => không xài assertEquals() vì hàm này cần 2 value để so sánh 
        //=> phải xài method khác để bắt các ngoại lệ
        computeFactorial(-5);
        computeFactorial(100);
    }
}
//code có khả năng còn tiềm ẩn lỗi nhưng clean, build luôn ra file jar nếu không sai cú pháp
// => phải disable clean and build nếu code còn màu đỏ có nghĩa là còn sai logic
//nhớ 2 con số: 1005 NetBeans 8, 1204 NetBeans 10 trở lên khi chơi với Ant Project
