/**
 * Chi Ieong Ng C00223421
 * Date: 25/02/2022
 */
package cm;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

class NgChiIeongTestTask {

    /**
     * Testcase #1
     * BigDecimal hourlyReducedRate = -1
     * Partition: hourlyReducedRate >= 0
     * @throws IllegalAccessException
     */
    @Test
    public void testcase1() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(-1);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #2
     * BigDecimal hourlyNormalRate = -20
     * Partition: hourlyNormalRate >= 0
     * @throws IllegalAccessException
     */
    @Test
    public void testcase2() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(-20);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #3
     * BigDecimal hourlyNormalRate = 0
     * BigDecimal hourlyReducedRate = 0
     * Partition: hourlyNormalRate >= 0 and hourlyReduced >= 0, and...
     * expert instance of Rate is generated
     */
    @Test
    public void testcase3() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(0);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #4
     * BigDecimal hourlyNormalRate = 5
     * BigDecimal hourlyReducedRate = 3
     * Partition: hourlyNormalRate >= 0 and hourlyReducedRate >= 0, and...
     * expert instance of Rate is generated
     */
    @Test
    public void testcase4() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #5
     * BigDecimal hourlyNormalRate = 1
     * * BigDecimal hourlyReducedRate = 2
     * Partition: hourlyNormalRate >= hourlyReducedRate
     * @throws IllegalAccessException
     */
    @Test
    public void testcase5() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(1);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #6
     * BigDecimal hourlyReducedRate = 1
     * BigDecimal hourlyNormalRate = 1
     * Partition: hourlyNormalRate >= hourlyReducedRate
     * expert instance of Rate is generated
     */
    @Test
    public void testcase6() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal hourlyReducedRate = new BigDecimal(1);
        BigDecimal hourlyNormalRate = new BigDecimal(1);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #7
     * ArrayList<Period> reducedPeriods = [(-1,3)]
     * Partition: startHour >= 0 and startHour <=24
     * @throws IllegalAccessException
     */
    @Test
    public void testcase7() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(-1,3));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #8
     * BigDecimal hourlyNormalRate = 3.1
     * Partition: hourlyNormalRate > hourlyReducedRate, and...
     * expert instance of Rate is generated
     */
    @Test
    public void testcase8() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(3.1);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #9
     * ArrayList<Period> normalPeriods = [(-1,4)]
     * Partition: startHour >= 0 && startHour <= 24
     * @throws IllegalAccessException
     */
    @Test
    public void testcase9() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(-1,4));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #10
     * ArrayList<Period> reducedPeriods = [(22,25)]
     * Partition: endHour >= 0 && endHour <= 24
     * @throws IllegalAccessException
     */
    @Test
    public void testcase10() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(22,25));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #11
     * ArrayList<Period> normalPeriods = [(22,'a')]
     * Partition: endHour >= 0 && endHour <= 24
     * @throws IllegalAccessException
     */
    @Test
    public void testcase11() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(22,'a'));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #12
     * ArrayList<Period> reducedPeriods = [null,(13,14),(8,22)]
     * Partition: endHour >= 0 && endHour <= 24
     * @throws IllegalAccessException
     */
    @Test
    public void testcase12() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,null,new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }
    /**
     * Testcase #13
     * ArrayList<Period> normalPeriods = null
     * Partition: endHour >= 0 && endHour <= 24
     * @throws IllegalAccessException
     */
    @Test
    public void testcase13() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = null;
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }
    /**
     * Testcase #14
     * ArrayList<Period> reducedPeriods = [(5,5),(13,14),(18,22)]
     * Partition: startHour < endHour
     * @throws IllegalAccessException
     */
    @Test
    public void testcase14() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,5),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #15
     * ArrayList<Period> normalPeriods = [(9,13),(18,14)]
     * Partition: startHour < endHour
     * @throws IllegalAccessException
     */
    @Test
    public void testcase15() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(18,14));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #16
     * ArrayList<Period> reducedPeriods = [(5,9),(8,14),(18,22)]
     * Partition: reducedPeriods[i].overlaps(reducedPeriods[i+1])
     * @throws IllegalAccessException
     */
    @Test
    public void testcase16() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(8,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #17
     * ArrayList<Period> normalPeriods = [(9,15),(14,18)]
     * Partition: normalPeriods[i].overlaps(normalPeriods[i+1])
     * @throws IllegalAccessException
     */
    @Test
    public void testcase17() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,15),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #18
     * ArrayList<Period> reducedPeriods = [(5,9),(13,14),(18,22)]
     * ArrayList<Period> normalPeriods = [(8,13),(14,18)]
     * Partition: normalPeriods[i].overlaps(reducedPeriods[j])
     * @throws IllegalAccessException
     */
    @Test
    public void testcase18() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(8,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #19
     * ArrayList<Period> reducedPeriods = [(5,9),(13,14),(17,22)]
     * ArrayList<Period> normalPeriods = [(8,13),(14,18)]
     * Partition: normalPeriods[i].overlaps(reducedPeriods[j])
     * @throws IllegalAccessException
     */
    @Test
    public void testcase19() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(17,22));
        Collections.addAll(normalPeriods,new Period(8,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #20
     * CarParkKind kind = "STAFF"
     * BigDecimal hourlyNormalRate = 99
     * BigDecimal hourlyReducedRate = 0
     * ArrayList<Period> reducedPeriods = [(0,9),(13,14),(18,24)]
     * ArrayList<Period> normalPeriods = [(9,13),(14,18)]
     * Partition: hourlyNormalRate >= 0 and hourlyReduced >= 0, then..
     *            hourlyNormalRate >= hourlyReducedRate, then
     *            startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour, then
     *            reducedPeriods[i].overlaps(reducedPeriods[i+1]), then
     *            normalPeriods[i].overlaps(normalPeriods[i+1]), then
     *            normalPeriods[i].overlaps(reducedPeriods[j]), and….
     * expert instance of Rate is generated
     */
    @Test
    public void testcase20() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(99);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,9),new Period(13,14),new Period(18,24));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #21
     * BigDecimal hourlyNormalRate = 0.99999999999999999999999999999999999999999
     * Partition: hourlyNormalRate >= 0 and hourlyReduced >= 0, then..
     *            hourlyNormalRate >= hourlyReducedRate, then
     *            startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour, then
     *            reducedPeriods[i].overlaps(reducedPeriods[i+1]), then
     *            normalPeriods[i].overlaps(normalPeriods[i+1]), then
     *            normalPeriods[i].overlaps(reducedPeriods[j]), and….
     * expert instance of Rate is generated
     */
    @Test
    public void testcase21() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal hourlyNormalRate = new BigDecimal(0.99999999999999999999999999999999999999999);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,9),new Period(13,14),new Period(18,24));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #22
     * BigDecimal hourlyNormalRate = 999999999999999999999999999999999999999999999999999999999999999999999999999999
     * Partition: Integer number too large (red line appeared)
     * test not allowed
     */
    /*
    @Test
    public void testcase22() throws IllegalAccessException {
        CarParkKind kind = new CarParkKind("VISITOR");
        BigDecimal hourlyNormalRate = new BigDecimal(999999999999999999999999999999999999999999999999999999999999999999999999999999);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,9),new Period(13,14),new Period(18,24));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind, hourlyReducedRate,hourlyNormalRate, reducedPeriods, normalPeriods);
    }*/

    /**
     * Testcase #23
     * BigDecimal hourlyNormalRate = 999999999
     * Partition: hourlyNormalRate >= 0 and hourlyReduced >= 0, then..
     *            hourlyNormalRate >= hourlyReducedRate, then
     *            startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour, then
     *            reducedPeriods[i].overlaps(reducedPeriods[i+1]), then
     *            normalPeriods[i].overlaps(normalPeriods[i+1]), then
     *            normalPeriods[i].overlaps(reducedPeriods[j]), and….
     * expert instance of Rate is generated
     */
    @Test
    public void testcase23() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal hourlyNormalRate = new BigDecimal(999999999);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,9),new Period(13,14),new Period(18,24));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #24
     * BigDecimal hourlyNormalRate = 999999999*999999999
     * Partition: hourlyNormalRate >= 0 and hourlyReduced >= 0, then..
     *            hourlyNormalRate >= hourlyReducedRate, then
     *            startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour, then
     *            reducedPeriods[i].overlaps(reducedPeriods[i+1]), then
     *            normalPeriods[i].overlaps(normalPeriods[i+1]), then
     *            normalPeriods[i].overlaps(reducedPeriods[j]), and….
     * expert instance of Rate is generated
     */
    @Test
    public void testcase24() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal hourlyNormalRate = new BigDecimal(999999999*999999999);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,9),new Period(13,14),new Period(18,24));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }
    /**
     * Testcase #25
     * BigDecimal hourlyReducedRate = null
     * Partition: hourlyNormalRate >= 0 and hourlyReduced >= 0
     * @throws IllegalAccessException
     */
    @Test
    public void testcase25() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.VISITOR;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = null;
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,9),new Period(13,14),new Period(18,24));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #26
     * CarParkKind kind = null
     * Partition: Kind's enum = STAFF or STUDENT or MANAGEMENT or VISITOR
     * my expert: Error
     * actual test in dummy class: instance of Rate is generated
     */
    @Test
    public void testcase26() throws IllegalAccessException {
        CarParkKind kind = null;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #27
     * CarParkKind kind = "staff"
     * Partition: Kind's enum = STAFF or STUDENT or MANAGEMENT or VISITOR
     * @throws IllegalAccessException
     */
    /*
    @Test
    public void testcase27() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.staff;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }*/

    /**
     * Testcase #28
     * CarParkKind kind = "STUDENT" + 1
     * Partition: Kind's enum = STAFF or STUDENT or MANAGEMENT or VISITOR
     * @throws IllegalAccessException
     */
    /*
    @Test
    public void testcase28() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT + 1;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }*/

    /**
     * Testcase #29
     * CarParkKind kind = null
     * BigDecimal hourlyNormalRate = null
     * BigDecimal hourlyReducedRate = null
     * ArrayList<Period> reducedPeriods = null;
     * ArrayList<Period> normalPeriods = null;
     * Partition: hourlyNormalRate >= 0 and hourlyReducedRate >= 0,
     * @throws IllegalAccessException
     */
    @Test
    public void testcase29() throws IllegalAccessException {
        Rate rate = new Rate(null,null,null,null,null);
    }

    /**
     * Testcase #30
     *  ArrayList<Period> reducedPeriods = null
     * Partition: startHour >= 0 && startHour <= 24
     *            endHour >= 0 && endHour <= 24
     * @throws IllegalAccessException
     */
    @Test
    public void testcase30() throws IllegalAccessException {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        ArrayList<Period> reducedPeriods = null;
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);
    }

    /**
     * Testcase #31
     * Period periodStay = new Period(0,5);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour, and….
     * expert: return 0
     */
    @Test
    public void testcase31() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));

        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(0,5);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #32
     * Period periodStay = new Period(-1,5);
     * Partition: startHour >= 0 && startHour <= 24,
     * @throws IllegalAccessException
     */
    @Test
    public void testcase32() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(-1,5);
        System.out.println(rate.calculate(periodStay));
    }
    /**
     * Testcase #33
     * Period periodStay = new Period(0,25);
     * Partition: startHour >= 0 && startHour <= 24,
     * @throws IllegalAccessException
     */
    @Test
    public void testcase33() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(0,25);
        System.out.println(rate.calculate(periodStay));
    }
    /**
     * Testcase #34
     * Period periodStay = new Period(23,6);
     * Partition: startHour < endHour
     * @throws IllegalAccessException
     */
    @Test
    public void testcase34() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(23,6);
        System.out.println(rate.calculate(periodStay));
    }
    /**
     * Testcase #35
     * Period periodStay = new Period(1,1);
     * Partition: startHour < endHour
     * @throws IllegalAccessException
     */
    @Test
    public void testcase35() throws IllegalAccessException {
        //percondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(1,1);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #36
     * Period periodStay = new Period(0,24);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return 58
     */
    @Test
    public void testcase36() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(0,24);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #37
     * Period periodStay = new Period(6,15);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return 33
     */
    @Test
    public void testcase37() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(6,15);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #38
     * Period periodStay = new Period(13,14);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return 2
     */
    @Test
    public void testcase38() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(13,14);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #39
     * Period periodStay = new Period(17,18);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return 5
     */
    @Test
    public void testcase39() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(17,18);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #40
     * Period periodStay = new Period(0,1);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return 0
     */
    @Test
    public void testcase40() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(5);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(5,9),new Period(13,14),new Period(18,22));
        Collections.addAll(normalPeriods,new Period(9,13),new Period(14,18));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(0,1);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #41
     * BigDecimal hourlyNormalRate = 999999999
     * Period periodStay = new Period(0,24);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return 0
     */
    @Test
    public void testcase41() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(999999999);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,1));
        Collections.addAll(normalPeriods,new Period(23,24));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(0,24);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #42
     * BigDecimal hourlyNormalRate = 999999999*999999999
     * Period periodStay = new Period(0,24);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return 9.99999998e+17
     * actual: return 808348673
     */
    @Test
    public void testcase42() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(999999999*999999999);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,1));
        Collections.addAll(normalPeriods,new Period(23,24));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(0,24);
        System.out.println(rate.calculate(periodStay));
    }

    /**
     * Testcase #43
     * BigDecimal hourlyNormalRate = 999999999*999999999*999999999
     * Period periodStay = new Period(0,24);
     * Partition: startHour >= 0 && startHour <= 24, and
     *            endHour >= 0 && endHour <= 24, then
     *            startHour < endHour
     * expect: return incalculable numbers
     * actual: Error
     */
    @Test
    public void testcase43() throws IllegalAccessException {
        //precondition
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(999999999*999999999*999999999);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Collections.addAll(reducedPeriods,new Period(0,1));
        Collections.addAll(normalPeriods,new Period(23,24));
        Rate rate = new Rate(kind,hourlyNormalRate,hourlyReducedRate,reducedPeriods,normalPeriods);

        //test calculate()
        Period periodStay = new Period(0,24);
        System.out.println(rate.calculate(periodStay));
    }
}