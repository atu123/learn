package cc.atu123.learn.design.factory;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 10:20
 */
public class AutomobileFactory {
    public void product(String type){
        if("BMW".equalsIgnoreCase(type)){
            new BMWAuto().product();
        }else if("Aodi".equalsIgnoreCase(type)){
            new AodiAuto().product();
        }else if(type==null||type.equals("")){
            System.out.println("请输入车型！！");
        }else{
            System.out.println("该车型不存在："+type);
        }
    }

}