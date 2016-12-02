package com.knightliao.canalx.processor;

import java.util.List;

import com.knightliao.canalx.core.dto.MysqlEntry;
import com.knightliao.canalx.core.dto.MysqlEntryWrap;
import com.knightliao.canalx.core.plugin.processor.ICanalProcessor;

/**
 * @author knightliao
 * @date 2016/12/1 11:52
 */
public interface IProcessorMgr {

    /**
     * @return
     */
    List<ICanalProcessor> getProcessorPlugin();

    /**
     * 执行
     *
     * @param
     */
    void runProcessor(MysqlEntryWrap entry);
}
