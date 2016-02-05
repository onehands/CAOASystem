/*
 */
package com.ca.business;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ca.dao.IAssectsSystemDao;
import com.ca.javaUtils.BeanUtils;
import com.ca.javaUtils.DateUtils;
import com.ca.model.MAssetsSystemVo;

@Component("AssetsSystemBusinessImpl")
public class AssetsSystemBusinessImpl implements IAssetsSystemBusiness {

    @Resource(name = "AssectsSystemDaoImpl")
    private IAssectsSystemDao assectsSystemDao;

    @Override
    public int insert(List<MAssetsSystemVo> list) {

        int result = 0;
        // 生成唯一keyID
        for (MAssetsSystemVo mAssetsSystemVo : list) {
            String keyID = getKeyID();
            mAssetsSystemVo.setKeyID(keyID);
            BeanUtils.notNull(mAssetsSystemVo);
        }
        list.add(new MAssetsSystemVo());
        int size = 1500;
        int flag = (int) Math.ceil(Double.valueOf(list.size()) / size);

        for (int i = 1; i <= flag; i++) {
            if (i == flag) {
                result += assectsSystemDao.insertList(list.subList((i - 1) * size, list.size() - 1));
            } else {
                result += assectsSystemDao.insertList(list.subList((i - 1) * size, i * size));
            }

        }
        return result;
    }

    /**
     * 添加方法注释.
     * 
     * @return .
     */
    private String getKeyID() {
        return DateUtils.dateToString(new Date(), "yyMMddHHmmssSSS") + new Random().nextInt();
    }

}
