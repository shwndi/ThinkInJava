package dateType;

import cn.hutool.core.io.file.FileWriter;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.sun.deploy.util.StringUtils;
import com.sun.javaws.Globals;
import jdk.nashorn.internal.runtime.JSONFunctions;

import java.io.*;

/**
 * @author czy
 * @date 2020-12-23
 */
public class Write3Txt {
    public static void main(String[] args) throws Exception {
        String txt = "{\"task_id\":\"d3cfa1357c2347c41843b79da88c52eb\",\"result\":\"\",\"status\":20000000,\"message\":\"SUCCESS\",\"flash_result\":{\"duration\":87120,\"completed\":true,\"sentences\":[{\"text\":\"你好，\",\"begin_time\":40,\"end_time\":448,\"channel_id\":0},{\"text\":\"我很高兴为您服务，\",\"begin_time\":448,\"end_time\":2080,\"channel_id\":0},{\"text\":\"请讲，\",\"begin_time\":2080,\"end_time\":2488,\"channel_id\":0},{\"text\":\"嗯，\",\"begin_time\":2488,\"end_time\":2692,\"channel_id\":0},{\"text\":\"你好，\",\"begin_time\":2692,\"end_time\":3100,\"channel_id\":0},{\"text\":\"就是我想问一下，\",\"begin_time\":3100,\"end_time\":4528,\"channel_id\":0},{\"text\":\"我这边的话有呃走了一票物流嘛，\",\"begin_time\":4528,\"end_time\":7384,\"channel_id\":0},{\"text\":\"然后想叫物流呃，\",\"begin_time\":7384,\"end_time\":8812,\"channel_id\":0},{\"text\":\"想叫物流点开发票，\",\"begin_time\":8812,\"end_time\":10444,\"channel_id\":0},{\"text\":\"他们说开不了，\",\"begin_time\":10444,\"end_time\":11668,\"channel_id\":0},{\"text\":\"这是要怎么操作呢？\",\"begin_time\":11668,\"end_time\":13300,\"channel_id\":0},{\"text\":\"您是表示的话是对方不给您开发票，\",\"begin_time\":14160,\"end_time\":17837,\"channel_id\":0},{\"text\":\"对吗？\",\"begin_time\":17837,\"end_time\":18327,\"channel_id\":0},{\"text\":\"啊对啊，\",\"begin_time\":18327,\"end_time\":19062,\"channel_id\":0},{\"text\":\"那您是想举报呢，\",\"begin_time\":19062,\"end_time\":20778,\"channel_id\":0},{\"text\":\"还是想怎么操作呢？\",\"begin_time\":20778,\"end_time\":22740,\"channel_id\":0},{\"text\":\"嗯，\",\"begin_time\":22800,\"end_time\":23045,\"channel_id\":0},{\"text\":\"我只要是说想要拿到发票，\",\"begin_time\":23045,\"end_time\":25748,\"channel_id\":0},{\"text\":\"但是我又不知道举报需要举报吗？\",\"begin_time\":25748,\"end_time\":28917,\"channel_id\":0},{\"text\":\"嗯，\",\"begin_time\":28917,\"end_time\":29101,\"channel_id\":0},{\"text\":\"那就问您的需求了呀。\",\"begin_time\":29101,\"end_time\":30753,\"channel_id\":0},{\"text\":\"因为您想通过税务这边来处理，\",\"begin_time\":30753,\"end_time\":33140,\"channel_id\":0},{\"text\":\"如果双方协商不了的，\",\"begin_time\":33140,\"end_time\":34792,\"channel_id\":0},{\"text\":\"那么可以嗯通过幺二三六，\",\"begin_time\":34792,\"end_time\":36811,\"channel_id\":0},{\"text\":\"如果您想举报的话，\",\"begin_time\":36811,\"end_time\":38280,\"channel_id\":0},{\"text\":\"我们也可以帮您反映上去。\",\"begin_time\":38280,\"end_time\":40300,\"channel_id\":0},{\"text\":\"嗯，\",\"begin_time\":40490,\"end_time\":40740,\"channel_id\":0},{\"text\":\"这样子是吧，\",\"begin_time\":40740,\"end_time\":41990,\"channel_id\":0},{\"text\":\"嗯，\",\"begin_time\":42000,\"end_time\":42181,\"channel_id\":0},{\"text\":\"那我那我再打电话看一下对方到底开不开吧，\",\"begin_time\":42181,\"end_time\":45631,\"channel_id\":0},{\"text\":\"然后再呃决定要不要举报啊，\",\"begin_time\":45631,\"end_time\":47809,\"channel_id\":0},{\"text\":\"是的，\",\"begin_time\":47809,\"end_time\":48172,\"channel_id\":0},{\"text\":\"去举报就比较麻烦了。\",\"begin_time\":48172,\"end_time\":49807,\"channel_id\":0},{\"text\":\"最好的话是双方能协商处理一下。\",\"begin_time\":49807,\"end_time\":52348,\"channel_id\":0},{\"text\":\"因为正常一个经营业务的话，\",\"begin_time\":52348,\"end_time\":54527,\"channel_id\":0},{\"text\":\"对方就应该给您开。\",\"begin_time\":54527,\"end_time\":55980,\"channel_id\":0},{\"text\":\"如果对方的话他确实很强硬的，\",\"begin_time\":56000,\"end_time\":58035,\"channel_id\":0},{\"text\":\"不给您开的，\",\"begin_time\":58035,\"end_time\":58818,\"channel_id\":0},{\"text\":\"您可以再联系我们。\",\"begin_time\":58818,\"end_time\":60071,\"channel_id\":0},{\"text\":\"现在单位是我们浙江省内的单位吗？\",\"begin_time\":60071,\"end_time\":62420,\"channel_id\":0},{\"text\":\"呃，\",\"begin_time\":62650,\"end_time\":62968,\"channel_id\":0},{\"text\":\"我我从我是从肇东发到义乌的，\",\"begin_time\":62968,\"end_time\":67105,\"channel_id\":0},{\"text\":\"然后呃钱的话，\",\"begin_time\":67105,\"end_time\":69015,\"channel_id\":0},{\"text\":\"昨天会这个运费的时候，\",\"begin_time\":69015,\"end_time\":71340,\"channel_id\":0},{\"text\":\"其实是义乌这边收的，\",\"begin_time\":71340,\"end_time\":73064,\"channel_id\":0},{\"text\":\"义乌那边收的。\",\"begin_time\":73064,\"end_time\":74213,\"channel_id\":0},{\"text\":\"哎，\",\"begin_time\":74213,\"end_time\":74404,\"channel_id\":0},{\"text\":\"对，\",\"begin_time\":74404,\"end_time\":74596,\"channel_id\":0},{\"text\":\"那可以的。\",\"begin_time\":74596,\"end_time\":75362,\"channel_id\":0},{\"text\":\"那正常情况下应该先反映到义乌这边，\",\"begin_time\":75362,\"end_time\":78426,\"channel_id\":0},{\"text\":\"先去核实一下这个情况。\",\"begin_time\":78426,\"end_time\":80341,\"channel_id\":0},{\"text\":\"所以您可以先跟义乌这边先问问，\",\"begin_time\":80341,\"end_time\":83022,\"channel_id\":0},{\"text\":\"看这家单位。\",\"begin_time\":83022,\"end_time\":83980,\"channel_id\":0},{\"text\":\"嗯，\",\"begin_time\":84000,\"end_time\":84264,\"channel_id\":0},{\"text\":\"好的好的啊，\",\"begin_time\":84264,\"end_time\":85554,\"channel_id\":0},{\"text\":\"改啥意见，\",\"begin_time\":85554,\"end_time\":86250,\"channel_id\":0},{\"text\":\"嗯，\",\"begin_time\":86250,\"end_time\":86424,\"channel_id\":0},{\"text\":\"好，\",\"begin_time\":86424,\"end_time\":86598,\"channel_id\":0},{\"text\":\"谢谢啊。\",\"begin_time\":86598,\"end_time\":87120,\"channel_id\":0}],\"latency\":1694}}";
        JSONObject jsonObject = JSONUtil.parseObj(txt);
        jsonObject = jsonObject.getJSONObject("flash_result");
        JSONArray sentences = jsonObject.getJSONArray("sentences");
        File file = new File("E:\\789.txt");
        if (!file.exists())
            file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, false)));

        for (int i = 0; i < sentences.size(); i++) {
            JSONObject jsonObject1 = sentences.getJSONObject(i);
            String text = jsonObject1.getStr("text");
            writer.write(text);
            writer.newLine();
            System.out.println(text);
        }
        writer.flush();
        writer.close();
    }
}
