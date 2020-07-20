/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anhplp.util;

/**
 *
 * @author theFrozenAdam
 */
//class chua cac ham toan hoc tinh toan voi muc tieu la xai chung cho cac noi khac
//cai gi xai chung thi mac dinh la static
public class MathUtils {

    //vi la tinh so giai thua => dung kieu long
    //tinh giai thua tu 15! tro ve sau
    public static long computeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid input, n must larger than 0");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
