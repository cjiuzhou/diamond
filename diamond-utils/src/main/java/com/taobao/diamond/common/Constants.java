/*
 * (C) 2007-2012 Alibaba Group Holding Limited.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 * Authors:
 *   leiwen <chrisredfield1985@126.com> , boyan <killme2008@gmail.com>
 */
package com.taobao.diamond.common;

public interface Constants {

    String DEFAULT_GROUP = "DEFAULT_GROUP";

    String BASE_DIR = "config-data";

    String DEFAULT_DOMAINNAME = "config.diamond.org";

    String DAILY_DOMAINNAME = "config.diamond.org";

    int DEFAULT_PORT = 8080;

    String NULL = "";

    String DATAID = "dataId";

    String GROUP = "group";

    String LAST_MODIFIED = "Last-Modified";

    String ACCEPT_ENCODING = "Accept-Encoding";

    String CONTENT_ENCODING = "Content-Encoding";

    String PROBE_MODIFY_REQUEST = "Probe-Modify-Request";

    String PROBE_MODIFY_RESPONSE = "Probe-Modify-Response";

    String PROBE_MODIFY_RESPONSE_NEW = "Probe-Modify-Response-New";

    String CONTENT_MD5 = "Content-MD5";

    String IF_MODIFIED_SINCE = "If-Modified-Since";

    String SPACING_INTERVAL = "client-spacing-interval";

    int POLLING_INTERVAL_TIME = 15;// 秒

    int ONCE_TIMEOUT = 2000;// 毫秒

    int CONN_TIMEOUT = 2000;// 毫秒

    int RECV_WAIT_TIMEOUT = ONCE_TIMEOUT * 5;// 毫秒

    String HTTP_URI_FILE = "/config.co";

    String CONFIG_HTTP_URI_FILE = "/url.do";

    String HTTP_URI_LOGIN = "/url";

    String ENCODE = "UTF-8";

    String LINE_SEPARATOR = Character.toString((char) 1);

    String WORD_SEPARATOR = Character.toString((char) 2);

    String DEFAULT_USERNAME = "xxx";

    String DEFAULT_PASSWORD = "xxx";

    /*
     * 批量操作时, 单条数据的状态码
     */
    // 发生异常
    int BATCH_OP_ERROR = -1;
    // 查询成功, 数据存在
    int BATCH_QUERY_EXISTS = 1;
    // 查询成功, 数据不存在
    int BATCH_QUERY_NONEXISTS = 2;
    // 新增成功
    int BATCH_ADD_SUCCESS = 3;
    // 更新成功
    int BATCH_UPDATE_SUCCESS = 4;

    String CONF_KEY_CONFIG_IP = "diamond.config.ip";
    String CONF_KEY_PORT = "diamond.port";

}