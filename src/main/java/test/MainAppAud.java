package test;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by User on 12.01.2017.
 */
public class MainAppAud {
    public static void main(String[] args) {
        GenericXmlApplicationContext gex = new GenericXmlApplicationContext();
        gex.load("testSp/sp.xml");
        gex.refresh();

        AppAud appAud = gex.getBean("appAud", AppAud.class);
        System.out.println(
                "getNameAuditorium="+appAud.getNameAuditorium()
                +", getSeatsNumberAuditorium="+appAud.getSeatsNumberAuditorium()
                +", getSeatsVipNumber"+appAud.getSeatsVipNumber()
        );

    }
}
