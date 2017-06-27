package cn.wenjun.learning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DollarTest {

    @Test
    public void can_init_with_amount() throws Exception {
        Dollar dollar = new Dollar(10);
        assertThat(dollar.getAmount(), equalTo((double)10));
    }

    @Test
    public void can_add_another_dollar() throws Exception {
        Dollar dollar = new Dollar(10);
        Dollar dollar2 = new Dollar(20);
        Dollar dollarResult = (Dollar) dollar.add(dollar2);
        assertThat(dollarResult.getAmount(), equalTo((double)30));
    }

    @Test
    public void get_dollar_amount() throws Exception {
        Dollar dollar = new Dollar(10);
        assertThat(dollar.getDollarAmount(), equalTo((double)10));

        Franc franc = new Franc(10);
        assertThat(franc.getDollarAmount(), equalTo((double)5));
    }

    @Test
    public void can_add_another_currency() throws Exception {
        Dollar dollar = new Dollar(10);
        Franc franc = new Franc(20);

        Dollar dollarResult = dollar.add(franc);
        assertThat(dollarResult.getAmount(), equalTo((double)20));
    }

    @Test
    public void franc_can_add_another_currency() throws Exception {
        Dollar dollar = new Dollar(100);
        Franc franc = new Franc(20);

        Dollar dollarResult = franc.add(dollar);
        assertThat(dollarResult.getAmount(), equalTo((double)110));
    }
}