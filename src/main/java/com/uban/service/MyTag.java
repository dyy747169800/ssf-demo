package com.uban.service;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

@Service
public class MyTag implements TemplateDirectiveModel {

    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
        // 获取页面的参数
        Integer foreachCount = Integer.parseInt(params.get("foreachCount").toString());
        List<String> contentList = new ArrayList<String>();
        for (int i = 0; i < foreachCount; i++) {
            contentList.add("字符串"+i);
        }
        //import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;
        //放置变量
        env.setVariable("content_list",DEFAULT_WRAPPER.wrap(contentList));

        //渲染页面
        body.render(env.getOut());
    }
}
