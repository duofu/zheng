package com.zheng.cms.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.cms.dao.mapper.CmsArticleCategoryMapper;
import com.zheng.cms.dao.model.CmsArticleCategory;
import com.zheng.cms.dao.model.CmsArticleCategoryExample;
import com.zheng.cms.rpc.api.CmsArticleCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleCategoryService实现
* Created by shuzheng on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class CmsArticleCategoryServiceImpl extends BaseServiceImpl<CmsArticleCategoryMapper, CmsArticleCategory, CmsArticleCategoryExample> implements CmsArticleCategoryService {

    private static Logger _log = LoggerFactory.getLogger(CmsArticleCategoryServiceImpl.class);

    @Autowired
    CmsArticleCategoryMapper cmsArticleCategoryMapper;

}