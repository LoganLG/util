/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lg.util.constant;

/**
 * @author lengleng
 * @date 2019/2/1
 */
public interface SecurityConstant {
    /**
     * jwt加密
     */
    String JWT_SECRET = "ZJIC";

    /**
     * 前缀
     */
    String PROJECT_PREFIX = "zjic_";

    /**
     * oauth 相关前缀
     */
    String OAUTH_PREFIX = "oauth_";
    /**
     * 项目的license
     */
    String PROJECT_LICENSE = "made by zjic";

    /**
     * 内部
     */
    String FROM_IN = "in";

    /**
     * 标志
     */
    String FROM = "From";

    /**
     * 手机号登录URL
     */
    String MOBILE_TOKEN_URL = "/mobile/token";

    /**
     * 默认登录URL
     */
    String OAUTH_TOKEN_URL = "/oauth/token";

    /**
     * grant_type
     */
    String GRANT_TYPE = "grant_type";

    String REFRESH_TOKEN = "refresh_token";

    String ACCESS_TOKEN = "access_token";

    String AUTHORIZATION_CODE = "authorization_code";

    String PASSWORD = "password";

    String USERNAME = "username";

    String CLIENT_CREDENTIALS = "client_credentials";

    String CLIENT_CREDENTIAL = "client_credential";

    /**
     * 钉钉第三方登录
     */
    String ACCESS_KEY = "accessKey";

    String TIMESTAMP = "timestamp";

    String SIGNATURE = "signature";

    String TMP_AUTH_CODE = "tmp_auth_code";

    /**
     * redis token key
     */
    String PROJECT_OAUTH_ACCESS = SecurityConstant.PROJECT_PREFIX + SecurityConstant.OAUTH_PREFIX + "access:";

    /**
     * oauth 客户端信息
     */
    String CLIENT_DETAILS_KEY = PROJECT_PREFIX + OAUTH_PREFIX + "client:details";

    /**
     * {bcrypt} 加密的特征码
     */
    String BCRYPT = "{bcrypt}";
    /**
     * oauth_client_details 表的字段，不包括client_id、client_secret
     */
    String CLIENT_FIELDS = "client_id, CONCAT('{noop}',client_secret) as client_secret, resource_ids, scope, "
            + "authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, "
            + "refresh_token_validity, additional_information, autoapprove";

    /**
     * JdbcClientDetailsService 查询语句
     */
    String BASE_FIND_STATEMENT = "select " + CLIENT_FIELDS
            + " from oauth_client_details";

    /**
     * 默认的查询语句
     */
    String DEFAULT_FIND_STATEMENT = BASE_FIND_STATEMENT + " order by client_id";

    /**
     * 按条件client_id 查询
     */
    String DEFAULT_SELECT_STATEMENT = BASE_FIND_STATEMENT + " where client_id = ?";

    /***
     * 资源服务器默认bean名称
     */
    String RESOURCE_SERVER_CONFIGURER = "resourceServerConfigurerAdapter";
}
