/** 基于Dubbo的分布式系统架构视频教程，吴水成，wu-sc@foxmail.com，学习交流QQ群：367211134 **/
package wusc.edu.demo.redis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import redis.clients.jedis.Jedis;

/**
 *
 * @描述: Redis测试 .
 * @作者: WuShuicheng .
 * @创建时间: 2015-3-23,上午1:30:40 .
 * @版本号: V1.0 .
 */
public class RedisTest {
	private static final Log log = LogFactory.getLog(RedisTest.class);

	public static void main(String[] args) {

		Jedis jedis = new Jedis("192.168.1.114");

		String key = "wusc";
		String value = "";

		jedis.del(key); // 删数据

		jedis.set(key, "WuShuicheng"); // 存数据
		value = jedis.get(key); // 取数据
		log.info(key + "=" + value);

		jedis.set(key, "WuShuicheng2"); // 存数据
		value = jedis.get(key); // 取数据
		log.info(key + "=" + value);

//		jedis.del(key); // 删数据
		value = jedis.get(key); // 取数据
		log.info(key + "=" + value);
	}
}
