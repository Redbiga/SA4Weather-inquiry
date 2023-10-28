package example;
/**
 * @param: null
 * @return 
 * @date 2023/10/28 22:24
 * @description 
 */

import example.client.WeatherWSLocator;
import example.client.WeatherWSSoap_PortType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class client_main {
    public static void main(String args[]){
        //加载用户界面
        loadUI();

    }

    public static String[] getCityWeather(String city){
        String[] weather = {};
        try{
            WeatherWSLocator locator = new WeatherWSLocator();
            WeatherWSSoap_PortType service = locator.getWeatherWSSoap();

            weather = service.getWeather(city,"");
        } catch (javax.xml.rpc.ServiceException e){
            e.printStackTrace();
        } catch(java.rmi.RemoteException e){
            e.printStackTrace();
        }
        return weather;
    }

    public static String[] getCity(){
        String[] city = {};
        try{
            WeatherWSLocator locator = new WeatherWSLocator();
            WeatherWSSoap_PortType service = locator.getWeatherWSSoap();

            city = service.getSupportCityString("四川");
        } catch (javax.xml.rpc.ServiceException e){
            e.printStackTrace();
        } catch(java.rmi.RemoteException e){
            e.printStackTrace();
        }
        return city;
    }

    public static void loadUI(){
        JFrame jf = new JFrame("四川省天气预报系统");
        jf.setSize(1000, 800);// 设置窗口大小
        jf.setLocationRelativeTo(null);// 把窗口位置设置到屏幕中心
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 当点击窗口的关闭按钮时退出程序

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel userLabel = new JLabel("请输入城市/地区名:");
        userLabel.setFont(new Font(null, Font.PLAIN, 25));
        userLabel.setBounds(10,10,250,50);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(250,20,100,40);
        panel.add(userText);
        JButton Button = new JButton("查询");
        Button.setFont(new Font(null, Font.BOLD, 20));
        Button.setForeground(Color.BLUE);
        Button.setBackground(Color.WHITE);
        Button.setBounds(500,10,100,60);
        panel.add(Button);
        JButton Button1 = new JButton("查看支持的城市/地区");
        Button1.setFont(new Font(null, Font.BOLD, 20));
        Button1.setForeground(Color.GREEN);
        Button1.setBackground(Color.WHITE);
        Button1.setBounds(650,10,280,60);
        panel.add(Button1);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10,100,965,600);
        textArea.setEditable(false);
        textArea.setFont(new Font(null, Font.PLAIN, 20));
        JScrollPane js=new JScrollPane(textArea);
        js.setBounds(10,100,965,600);
        panel.add(js);

        JLabel label = new JLabel("WEB 服务：http://www.webxml.com.cn/");
        label.setFont(new Font(null, Font.PLAIN, 15));
        label.setBounds(10,700,300,30);
        panel.add(label);

        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //清空内容
                textArea.setText("");
                String[] result = getCityWeather(userText.getText());
                for(String line : result){
                    if(!line.contains(".gif")){
                        textArea.append(line);
                        textArea.append("\n");
                    }
                }
            }
        });

        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] result = getCity();
                //结果转为字符串
                StringBuffer result_buffer = new StringBuffer();
                for(int i=0; i<result.length; i++){
                    result_buffer.append(result[i]);
                    if(i != (result.length-1)){
                        result_buffer.append(",");
                    }
                    if((i+1) % 5 == 0){
                        result_buffer.append("\n");
                    }
                }
                String result_str = result_buffer.toString();
                JOptionPane.showMessageDialog(
                        panel,
                        result_str,
                        "支持的城市/地区",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
