package stateless;

import javax.naming.Context;
import javax.naming.InitialContext;

public class AdderTest {
    public static void main(String[] args) throws Exception {
        Context context = new InitialContext();
        AdderImplRemote remote = (AdderImplRemote) context.lookup("st1");
        System.out.println(remote.add(32,34));
    }
}
