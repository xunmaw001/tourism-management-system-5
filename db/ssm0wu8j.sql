/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3306
 Source Schema         : ssm0wu8j

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 09/12/2020 16:03:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人',
  `phone` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  `isdefault` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500037094 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '地址' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, '2020-12-09 12:04:46', 1, '宇宙银河系金星1号', '金某', '13823888881', '是');
INSERT INTO `address` VALUES (2, '2020-12-09 12:04:46', 2, '宇宙银河系木星1号', '木某', '13823888882', '是');
INSERT INTO `address` VALUES (3, '2020-12-09 12:04:46', 3, '宇宙银河系水星1号', '水某', '13823888883', '是');
INSERT INTO `address` VALUES (4, '2020-12-09 12:04:46', 4, '宇宙银河系火星1号', '火某', '13823888884', '是');
INSERT INTO `address` VALUES (5, '2020-12-09 12:04:46', 5, '宇宙银河系土星1号', '土某', '13823888885', '是');
INSERT INTO `address` VALUES (6, '2020-12-09 12:04:46', 6, '宇宙银河系月球1号', '月某', '13823888886', '是');
INSERT INTO `address` VALUES (1607500037093, '2020-12-09 15:47:16', 1607499985636, '江西省赣州市安远县鹤子镇板寮坑', '张三', '13800000000', '是');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'jiudianyuyue' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NULL DEFAULT NULL COMMENT '单价',
  `discountprice` float NULL DEFAULT NULL COMMENT '会员价',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500139725 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (1607500139724, '2020-12-09 15:48:59', 'tesechanpin', 1607499985636, 1607499454479, '火山灰', 'http://localhost:8080/ssm0wu8j/upload/1607499434856.jpg', 1, 100, 0);

-- ----------------------------
-- Table structure for chat
-- ----------------------------
DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) NULL DEFAULT NULL COMMENT '管理员id',
  `ask` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '提问',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复',
  `isreply` int(11) NULL DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500662500 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '客服聊天表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chat
-- ----------------------------
INSERT INTO `chat` VALUES (1, '2020-12-09 12:04:46', 1, 1, '提问1', '回复1', 1);
INSERT INTO `chat` VALUES (2, '2020-12-09 12:04:46', 2, 2, '提问2', '回复2', 2);
INSERT INTO `chat` VALUES (3, '2020-12-09 12:04:46', 3, 3, '提问3', '回复3', 3);
INSERT INTO `chat` VALUES (4, '2020-12-09 12:04:46', 4, 4, '提问4', '回复4', 4);
INSERT INTO `chat` VALUES (5, '2020-12-09 12:04:46', 5, 5, '提问5', '回复5', 5);
INSERT INTO `chat` VALUES (6, '2020-12-09 12:04:46', 6, 6, '提问6', '回复6', 6);
INSERT INTO `chat` VALUES (1607500244590, '2020-12-09 15:50:44', 1607499985636, NULL, '在吗', NULL, 0);
INSERT INTO `chat` VALUES (1607500662499, '2020-12-09 15:57:41', 1607499985636, 1, NULL, '在的', NULL);

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'http://localhost:8080/ssm0wu8j/upload/1607500602331.png');
INSERT INTO `config` VALUES (2, 'picture2', 'http://localhost:8080/ssm0wu8j/upload/picture2.jpg');
INSERT INTO `config` VALUES (3, 'picture3', 'http://localhost:8080/ssm0wu8j/upload/picture3.jpg');
INSERT INTO `config` VALUES (4, 'picture4', 'http://localhost:8080/ssm0wu8j/upload/picture4.jpg');
INSERT INTO `config` VALUES (5, 'picture5', 'http://localhost:8080/ssm0wu8j/upload/picture5.jpg');
INSERT INTO `config` VALUES (6, 'homepage', NULL);

-- ----------------------------
-- Table structure for discussjingdianjieshao
-- ----------------------------
DROP TABLE IF EXISTS `discussjingdianjieshao`;
CREATE TABLE `discussjingdianjieshao`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `content` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500010446 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '景点介绍评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discussjingdianjieshao
-- ----------------------------
INSERT INTO `discussjingdianjieshao` VALUES (1, '2020-12-09 12:04:46', 1, '评论内容1', 1);
INSERT INTO `discussjingdianjieshao` VALUES (2, '2020-12-09 12:04:46', 2, '评论内容2', 2);
INSERT INTO `discussjingdianjieshao` VALUES (3, '2020-12-09 12:04:46', 3, '评论内容3', 3);
INSERT INTO `discussjingdianjieshao` VALUES (4, '2020-12-09 12:04:46', 4, '评论内容4', 4);
INSERT INTO `discussjingdianjieshao` VALUES (5, '2020-12-09 12:04:46', 5, '评论内容5', 5);
INSERT INTO `discussjingdianjieshao` VALUES (6, '2020-12-09 12:04:46', 6, '评论内容6', 6);
INSERT INTO `discussjingdianjieshao` VALUES (1607500010445, '2020-12-09 15:46:50', 1607499270634, '测试', 1607499985636);

-- ----------------------------
-- Table structure for discussjiudianyuyue
-- ----------------------------
DROP TABLE IF EXISTS `discussjiudianyuyue`;
CREATE TABLE `discussjiudianyuyue`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `content` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500170597 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '酒店预约评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discussjiudianyuyue
-- ----------------------------
INSERT INTO `discussjiudianyuyue` VALUES (1, '2020-12-09 12:04:47', 1, '评论内容1', 1);
INSERT INTO `discussjiudianyuyue` VALUES (2, '2020-12-09 12:04:47', 2, '评论内容2', 2);
INSERT INTO `discussjiudianyuyue` VALUES (3, '2020-12-09 12:04:47', 3, '评论内容3', 3);
INSERT INTO `discussjiudianyuyue` VALUES (4, '2020-12-09 12:04:47', 4, '评论内容4', 4);
INSERT INTO `discussjiudianyuyue` VALUES (5, '2020-12-09 12:04:47', 5, '评论内容5', 5);
INSERT INTO `discussjiudianyuyue` VALUES (6, '2020-12-09 12:04:47', 6, '评论内容6', 6);
INSERT INTO `discussjiudianyuyue` VALUES (1607500170596, '2020-12-09 15:49:30', 1607499608463, '城市', 1607499985636);

-- ----------------------------
-- Table structure for discussluxiantuijian
-- ----------------------------
DROP TABLE IF EXISTS `discussluxiantuijian`;
CREATE TABLE `discussluxiantuijian`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `content` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500121728 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '路线推荐评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discussluxiantuijian
-- ----------------------------
INSERT INTO `discussluxiantuijian` VALUES (1, '2020-12-09 12:04:46', 1, '评论内容1', 1);
INSERT INTO `discussluxiantuijian` VALUES (2, '2020-12-09 12:04:46', 2, '评论内容2', 2);
INSERT INTO `discussluxiantuijian` VALUES (3, '2020-12-09 12:04:46', 3, '评论内容3', 3);
INSERT INTO `discussluxiantuijian` VALUES (4, '2020-12-09 12:04:46', 4, '评论内容4', 4);
INSERT INTO `discussluxiantuijian` VALUES (5, '2020-12-09 12:04:46', 5, '评论内容5', 5);
INSERT INTO `discussluxiantuijian` VALUES (6, '2020-12-09 12:04:46', 6, '评论内容6', 6);
INSERT INTO `discussluxiantuijian` VALUES (1607500121727, '2020-12-09 15:48:41', 1607499342610, '城市', 1607499985636);

-- ----------------------------
-- Table structure for discusstesechanpin
-- ----------------------------
DROP TABLE IF EXISTS `discusstesechanpin`;
CREATE TABLE `discusstesechanpin`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `content` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500156966 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '特色产品评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discusstesechanpin
-- ----------------------------
INSERT INTO `discusstesechanpin` VALUES (1, '2020-12-09 12:04:47', 1, '评论内容1', 1);
INSERT INTO `discusstesechanpin` VALUES (2, '2020-12-09 12:04:47', 2, '评论内容2', 2);
INSERT INTO `discusstesechanpin` VALUES (3, '2020-12-09 12:04:47', 3, '评论内容3', 3);
INSERT INTO `discusstesechanpin` VALUES (4, '2020-12-09 12:04:47', 4, '评论内容4', 4);
INSERT INTO `discusstesechanpin` VALUES (5, '2020-12-09 12:04:47', 5, '评论内容5', 5);
INSERT INTO `discusstesechanpin` VALUES (6, '2020-12-09 12:04:47', 6, '评论内容6', 6);
INSERT INTO `discusstesechanpin` VALUES (1607500156965, '2020-12-09 15:49:16', 1607499454479, '城市2', 1607499985636);

-- ----------------------------
-- Table structure for forum
-- ----------------------------
DROP TABLE IF EXISTS `forum`;
CREATE TABLE `forum`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '帖子标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) NULL DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500218651 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '论坛表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of forum
-- ----------------------------
INSERT INTO `forum` VALUES (2, '2020-12-09 12:04:46', '帖子标题2', '帖子内容2', 2, 2, '用户名2', '开放');
INSERT INTO `forum` VALUES (3, '2020-12-09 12:04:46', '帖子标题3', '帖子内容3', 3, 3, '用户名3', '开放');
INSERT INTO `forum` VALUES (4, '2020-12-09 12:04:46', '帖子标题4', '帖子内容4', 4, 4, '用户名4', '开放');
INSERT INTO `forum` VALUES (5, '2020-12-09 12:04:46', '帖子标题5', '帖子内容5', 5, 5, '用户名5', '开放');
INSERT INTO `forum` VALUES (6, '2020-12-09 12:04:46', '帖子标题6', '帖子内容6', 6, 6, '用户名6', '开放');
INSERT INTO `forum` VALUES (1607500205513, '2020-12-09 15:50:05', '科摩罗哪里好玩', '<p>科摩罗哪里好玩求推荐</p>', 0, 1607499985636, '555', '开放');
INSERT INTO `forum` VALUES (1607500218650, '2020-12-09 15:50:18', NULL, '回帖/更贴', 1607500205513, 1607499985636, '555', NULL);

-- ----------------------------
-- Table structure for jingdianjieshao
-- ----------------------------
DROP TABLE IF EXISTS `jingdianjieshao`;
CREATE TABLE `jingdianjieshao`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `jingdianmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点名称',
  `jingdianleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点类型',
  `jingdiandengji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点等级',
  `chuyoujijie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出游季节',
  `jiaotongzhuangkuang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交通状况',
  `jingdianzhaopian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点照片',
  `xiangxidizhi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细地址',
  `jingdianjieshao` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '景点介绍',
  `jingdianxiangqing` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '景点详情',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500384130 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '景点介绍' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jingdianjieshao
-- ----------------------------
INSERT INTO `jingdianjieshao` VALUES (1, '2020-12-09 12:04:46', '景点名称1', '自然类旅游景区', '1A', '春季', '畅通', 'http://localhost:8080/ssm0wu8j/upload/jingdianjieshao_jingdianzhaopian1.jpg', '详细地址1', '景点介绍1', '景点详情1', 1, 1, 99.9);
INSERT INTO `jingdianjieshao` VALUES (2, '2020-12-09 12:04:46', '景点名称2', '自然类旅游景区', '1A', '春季', '畅通', 'http://localhost:8080/ssm0wu8j/upload/jingdianjieshao_jingdianzhaopian2.jpg', '详细地址2', '景点介绍2', '景点详情2', 2, 2, 99.9);
INSERT INTO `jingdianjieshao` VALUES (3, '2020-12-09 12:04:46', '景点名称3', '自然类旅游景区', '1A', '春季', '畅通', 'http://localhost:8080/ssm0wu8j/upload/jingdianjieshao_jingdianzhaopian3.jpg', '详细地址3', '景点介绍3', '景点详情3', 3, 3, 99.9);
INSERT INTO `jingdianjieshao` VALUES (4, '2020-12-09 12:04:46', '景点名称4', '自然类旅游景区', '1A', '春季', '畅通', 'http://localhost:8080/ssm0wu8j/upload/jingdianjieshao_jingdianzhaopian4.jpg', '详细地址4', '景点介绍4', '景点详情4', 4, 4, 99.9);
INSERT INTO `jingdianjieshao` VALUES (5, '2020-12-09 12:04:46', '景点名称5', '自然类旅游景区', '1A', '春季', '畅通', 'http://localhost:8080/ssm0wu8j/upload/jingdianjieshao_jingdianzhaopian5.jpg', '详细地址5', '景点介绍5', '景点详情5', 5, 5, 99.9);
INSERT INTO `jingdianjieshao` VALUES (6, '2020-12-09 12:04:46', '景点名称6', '自然类旅游景区', '1A', '春季', '畅通', 'http://localhost:8080/ssm0wu8j/upload/jingdianjieshao_jingdianzhaopian6.jpg', '详细地址6', '景点介绍6', '景点详情6', 6, 6, 99.9);
INSERT INTO `jingdianjieshao` VALUES (1607499270634, '2020-12-09 15:34:29', '卡尔塔拉火山', '自然类旅游景区', '5A', '全年', '畅通', 'http://localhost:8080/ssm0wu8j/upload/1607498199031.jpg', 'xx省xx市xx县', '卡尔塔拉火山（Kartala Volcano）是世界上最活跃的火山之一，科摩罗最高山，在莫桑比克海峡北部的大科摩罗岛南部。', '<p>	卡尔塔拉火山（Kartala Volcano）是世界上最活跃的火山之一，科摩罗最高山，在莫桑比克海峡北部的大科摩罗岛南部。1900-1965年间曾喷发11次，最近一次喷发在2005年底，火山喷出的灰云柱造成大科摩罗岛上25万居民暂时失去了饮用水。火山口周长15km、最大直径3.2km，海拔2560m；附近多死火山锥、火山湖和熔岩流。西侧迎风坡受栈道西北季风影响，年降水量高达5400mm以上，是印度洋降水量丰沛的地方。原热带森林广布，因过度砍伐，森林面积锐减，山麓有国家首都莫罗尼。<img src=\"http://localhost:8080/ssm0wu8j/upload/1607499268778.jpg\"></p>', 1, 0, 200);
INSERT INTO `jingdianjieshao` VALUES (1607500384129, '2020-12-09 15:53:03', '大科摩罗岛', '人文类旅游景区', '5A', '秋季', '畅通', 'http://localhost:8080/ssm0wu8j/upload/1607500357365.jpg', 'xx省xx市xx县', '大科摩罗岛的北部为海拔650米的高原，多圆形小丘。南部为卡尔塔拉活火山，海拔2560米，是全国最高峰；火山口直径3.2公里。沿海有狭窄平原，热带湿润气候。居民主要从事农业，产香精作物、椰子、咖啡、薯类等。岛上风光秀丽、海滩绵长，一派热带风光，是旅游的好去处。', '<p><br></p><p>大科摩罗岛是印度洋西部岛国科摩罗的最大岛，地处莫桑比克海峡北口。大科摩罗岛占地面积1148平方公里，人口19.1万（1980），为火山岛。最初，这个岛被阿拉伯水手命名为达加哉•阿乐•卡玛，意为月亮之岛，它位于非洲、亚洲和波利尼西亚的交会处—历史上长期在苏丹的武力窥视之中。1886年法国将大科摩罗岛和昂儒昂岛、莫埃利岛一起变成了法国的“保护地”。</p><p><br></p><p><img src=\"http://localhost:8080/ssm0wu8j/upload/1607500381843.jpg\">大科摩罗岛的北部为海拔650米的高原，多圆形小丘。南部为卡尔塔拉活火山，海拔2560米，是全国最高峰；火山口直径3.2公里。沿海有狭窄平原，热带湿润气候。居民主要从事农业，产香精作物、椰子、咖啡、薯类等。岛上风光秀丽、海滩绵长，一派热带风光，是旅游的好去处。</p>', 0, 0, 600);

-- ----------------------------
-- Table structure for jiudianyuyue
-- ----------------------------
DROP TABLE IF EXISTS `jiudianyuyue`;
CREATE TABLE `jiudianyuyue`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `jiudianmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '酒店名称',
  `jiudianxingji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '酒店星级',
  `jiudianweizhi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '酒店位置',
  `zhoubianjingdian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '周边景点',
  `kefangleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客房类型',
  `kefangmianji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客房面积',
  `mianfeikuandai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '免费宽带',
  `jiudianzhaopian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '酒店照片',
  `jiudianjieshao` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '酒店介绍',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500556168 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '酒店预约' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jiudianyuyue
-- ----------------------------
INSERT INTO `jiudianyuyue` VALUES (4, '2020-12-09 12:04:46', '酒店名称4', '一星级', '酒店位置4', '周边景点4', '客房类型4', '客房面积4', '有线宽带', 'http://localhost:8080/ssm0wu8j/upload/jiudianyuyue_jiudianzhaopian4.jpg', '酒店介绍4', 4, 4, 99.9);
INSERT INTO `jiudianyuyue` VALUES (5, '2020-12-09 12:04:46', '酒店名称5', '一星级', '酒店位置5', '周边景点5', '客房类型5', '客房面积5', '有线宽带', 'http://localhost:8080/ssm0wu8j/upload/jiudianyuyue_jiudianzhaopian5.jpg', '酒店介绍5', 5, 5, 99.9);
INSERT INTO `jiudianyuyue` VALUES (6, '2020-12-09 12:04:46', '酒店名称6', '一星级', '酒店位置6', '周边景点6', '客房类型6', '客房面积6', '有线宽带', 'http://localhost:8080/ssm0wu8j/upload/jiudianyuyue_jiudianzhaopian6.jpg', '酒店介绍6', 6, 6, 99.9);
INSERT INTO `jiudianyuyue` VALUES (1607499608463, '2020-12-09 15:40:07', '金沙大酒店', '五星级', 'xx省xx市xx县', '卡尔塔拉火山', '经济房', '20平方', '无线宽带', 'http://localhost:8080/ssm0wu8j/upload/1607499599557.jpg', '<p><img src=\"http://localhost:8080/ssm0wu8j/upload/1607499606109.jpg\"></p>', 1, 0, 200);
INSERT INTO `jiudianyuyue` VALUES (1607500556167, '2020-12-09 15:55:55', '恩华酒店', '四星级', 'xx省xx市xx县', '大科摩罗岛', '商务房', '30平方', '无线宽带', 'http://localhost:8080/ssm0wu8j/upload/1607500538731.jpg', '<p>编辑器可传文字/图片<img src=\"http://localhost:8080/ssm0wu8j/upload/1607500554619.jpg\"></p>', 0, 0, 300);

-- ----------------------------
-- Table structure for luxiantuijian
-- ----------------------------
DROP TABLE IF EXISTS `luxiantuijian`;
CREATE TABLE `luxiantuijian`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `gonglvebiaoti` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '攻略标题',
  `jingdianmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点名称',
  `jingdianleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点类型',
  `jingdiandengji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '景点等级',
  `chuyoujijie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出游季节',
  `chufachengshi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出发城市',
  `chuxianfangshi` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出现方式',
  `xingchengtianshu` int(11) NULL DEFAULT NULL COMMENT '行程天数',
  `gonglvefengmian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '攻略封面',
  `xingchengluxian` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '行程路线',
  `xiangqingneirong` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '详情内容',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500441298 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '路线推荐' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of luxiantuijian
-- ----------------------------
INSERT INTO `luxiantuijian` VALUES (1, '2020-12-09 12:04:46', '攻略标题1', '景点名称1', '景点类型1', '景点等级1', '出游季节1', '出发城市1', '客车', 1, 'http://localhost:8080/ssm0wu8j/upload/luxiantuijian_gonglvefengmian1.jpg', '行程路线1', '详情内容1', 1, 1, 99.9);
INSERT INTO `luxiantuijian` VALUES (2, '2020-12-09 12:04:46', '攻略标题2', '景点名称2', '景点类型2', '景点等级2', '出游季节2', '出发城市2', '客车', 2, 'http://localhost:8080/ssm0wu8j/upload/luxiantuijian_gonglvefengmian2.jpg', '行程路线2', '详情内容2', 2, 2, 99.9);
INSERT INTO `luxiantuijian` VALUES (3, '2020-12-09 12:04:46', '攻略标题3', '景点名称3', '景点类型3', '景点等级3', '出游季节3', '出发城市3', '客车', 3, 'http://localhost:8080/ssm0wu8j/upload/luxiantuijian_gonglvefengmian3.jpg', '行程路线3', '详情内容3', 3, 3, 99.9);
INSERT INTO `luxiantuijian` VALUES (4, '2020-12-09 12:04:46', '攻略标题4', '景点名称4', '景点类型4', '景点等级4', '出游季节4', '出发城市4', '客车', 4, 'http://localhost:8080/ssm0wu8j/upload/luxiantuijian_gonglvefengmian4.jpg', '行程路线4', '详情内容4', 4, 4, 99.9);
INSERT INTO `luxiantuijian` VALUES (5, '2020-12-09 12:04:46', '攻略标题5', '景点名称5', '景点类型5', '景点等级5', '出游季节5', '出发城市5', '客车', 5, 'http://localhost:8080/ssm0wu8j/upload/luxiantuijian_gonglvefengmian5.jpg', '行程路线5', '详情内容5', 5, 5, 99.9);
INSERT INTO `luxiantuijian` VALUES (6, '2020-12-09 12:04:46', '攻略标题6', '景点名称6', '景点类型6', '景点等级6', '出游季节6', '出发城市6', '客车', 6, 'http://localhost:8080/ssm0wu8j/upload/luxiantuijian_gonglvefengmian6.jpg', '行程路线6', '详情内容6', 6, 6, 99.9);
INSERT INTO `luxiantuijian` VALUES (1607499342610, '2020-12-09 15:35:42', '卡尔塔火山路线攻略', '卡尔塔拉火山', '自然类旅游景区', '5A', '全年', '广州', '飞机', 5, 'http://localhost:8080/ssm0wu8j/upload/1607499317480.jpg', 'xx省-xx省-xx省-xx省-xx省-xx省-xx省-xx省', '<p><img src=\"http://localhost:8080/ssm0wu8j/upload/1607499341433.jpeg\"></p>', 1, 0, 200);
INSERT INTO `luxiantuijian` VALUES (1607500441297, '2020-12-09 15:54:00', '大科摩罗岛路线攻略', '大科摩罗岛', '人文类旅游景区', '5A', '秋季', '深圳', '飞机', 6, 'http://localhost:8080/ssm0wu8j/upload/1607500429889.jpeg', 'xx省-xx省-xx省-xx省-xx省-xx省', '<p>大科摩罗岛的北部为海拔650米的高原，多圆形小丘。南部为卡尔塔拉活火山，海拔2560米，是全国最高峰；火山口直径3.2公里。沿海有狭窄平原，热带湿润气候。居民主要从事农业，产香精作物、椰子、咖啡、薯类等。岛上风光秀丽、海滩绵长，一派热带风光，是旅游的好去处。</p>', 0, 0, 200);

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500646380 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '新闻资讯' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, '2020-12-09 12:04:46', '卡尔塔拉火山', 'http://localhost:8080/ssm0wu8j/upload/news_picture1.jpg', '<p class=\"ql-align-center\"><br></p><p>卡尔塔拉火山（Kartala Volcano）是世界上最活跃的火山之一，科摩罗最高山，在莫桑比克海峡北部的大科摩罗岛南部。1900-1965年间曾喷发11次，最近一次喷发在2005年底，火山喷出的灰云柱造成大科摩罗岛上25万居民暂时失去了饮用水。火山口周长15km、最大直径3.2km，海拔2560m；附近多死火山锥、火山湖和熔岩流。西侧迎风坡受栈道西北季风影响，年降水量高达5400mm以上，是印度洋降水量丰沛的地方。原热带森林广布，因过度砍伐，森林面积锐减，山麓有国家首都莫罗尼。</p><p>科摩罗群岛是一组火山岛群，岛上大部分为山地，地势崎岖，广布森林。由于这是一个火山国家，它的各个岛屿上基本上都是火山岩，没有泥土。这些树木水果都是靠自然野生野长，人类基本无法种植。卡尔塔拉火山距莫罗尼15公里远，位于科摩罗最大的岛大科摩罗岛上，至今还在活动。</p>');
INSERT INTO `news` VALUES (2, '2020-12-09 12:04:46', '马约特岛', 'http://localhost:8080/ssm0wu8j/upload/news_picture2.jpg', '<p class=\"ql-align-center\"><br></p><p>马约特岛（Mayotte ）位于莫桑比克海峡，与大科摩罗岛、昂儒昂岛、莫埃利岛共同组成科摩罗群岛。马约特岛占地面积374平方公里，居民约18万人，经济以农业为主，主要生产香子兰等香料，是法国的海外领地之一，马约特岛包括大陆地岛、小陆地岛以及周围一些小岛。</p><p>马约特岛属温暖、潮湿的海洋性气候，植被为繁茂常绿的热带林。马约特岛上火山山脉为南北走向，有海拔500∼600公尺的山峰，沿海有珊瑚礁环绕，陆地和珊瑚礁之间的水域有利于水运和渔业。珊瑚礁围绕着一些岛屿起到了保护船只和栖息鱼群的作用。马约特岛有绵长的优质海滩、蓝绿的海水、蔚蓝的天空，使人心情愉悦。多种多样的娱乐项目使人放松到底，玩的尽兴。此外，其形态各异的珊瑚礁为此岛的一大亮点。</p>');
INSERT INTO `news` VALUES (3, '2020-12-09 12:04:46', '大科摩罗岛', 'http://localhost:8080/ssm0wu8j/upload/news_picture3.jpg', '<p class=\"ql-align-center\"><a href=\"http://www.bytravel.cn/landscape/22/moluoni.html\" rel=\"noopener noreferrer\" target=\"_blank\" style=\"color: rgb(255, 68, 0);\"><img src=\"http://h.bytravel.cn/www/22/head/21990.gif\"></a></p><p>	大科摩罗岛是印度洋西部岛国科摩罗的最大岛，地处莫桑比克海峡北口。大科摩罗岛占地面积1148平方公里，人口19.1万（1980），为火山岛。最初，这个岛被阿拉伯水手命名为达加哉•阿乐•卡玛，意为月亮之岛，它位于非洲、亚洲和波利尼西亚的交会处—历史上长期在苏丹的武力窥视之中。1886年法国将大科摩罗岛和昂儒昂岛、莫埃利岛一起变成了法国的“保护地”。</p><p>	大科摩罗岛的北部为海拔650米的高原，多圆形小丘。南部为卡尔塔拉活火山，海拔2560米，是全国最高峰；火山口直径3.2公里。沿海有狭窄平原，热带湿润气候。居民主要从事农业，产香精作物、椰子、咖啡、薯类等。岛上风光秀丽、海滩绵长，一派热带风光，是旅游的好去处。</p>');
INSERT INTO `news` VALUES (1607500646379, '2020-12-09 15:57:26', '莫罗尼', 'http://localhost:8080/ssm0wu8j/upload/1607500644732.jpg', '<p class=\"ql-align-center\"><a href=\"http://www.bytravel.cn/landscape/22/kaertalahuoshan.html\" rel=\"noopener noreferrer\" target=\"_blank\" style=\"color: rgb(0, 0, 153);\"><img src=\"http://h.bytravel.cn/www/22/head/21989.gif\"></a></p><p>	莫罗尼是科摩罗第一大城市，科摩罗政治、经济和海、空交通的中心。莫罗尼的城市建设具有阿拉伯城市的风格，城内有许多清真寺和朝圣中心，主要的旅游点有伊扎恩德拉附近的海滨、密扎米欧里码头的预言者洞穴及火山形成的盐湖等。城市西临浩瀚的印度洋，其他三面是密密的椰林。市区街道狭窄而弯曲，在这些小巷中有不少具有阿拉伯色彩的古老建筑，市内多清真寺，契昂达清真寺是穆斯林朝拜的中心。</p><p>	莫罗尼城里、郊外到处可见花香扑鼻的伊兰伊兰花丛，伊兰伊兰花是一种乔木，高达3～4米，开的黄花极为清香。近郊多死火山，山坡上青翠挺拔的椰林、成片的伊兰伊兰林园一望无际。碧绿的香蕉、芭蕉丛，巨大的芒果树和香草满山遍野。“科摩罗”一词在阿拉伯语里是“月亮”的意思，因此，科摩罗群岛又被人们称为“月亮”群岛，这个国家也被称为“月亮之国”，而莫罗尼也自然地被人们称为“月亮之都”了。</p>');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `orderid` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'jiudianyuyue' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NOT NULL DEFAULT 0 COMMENT '价格/积分',
  `discountprice` float NULL DEFAULT 0 COMMENT '折扣价格',
  `total` float NOT NULL DEFAULT 0 COMMENT '总价格/总积分',
  `discounttotal` float NULL DEFAULT 0 COMMENT '折扣总价格',
  `type` int(11) NULL DEFAULT 1 COMMENT '支付类型',
  `status` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `orderid`(`orderid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500177954 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1607500054068, '2020-12-09 15:47:33', '202012915473357097772', 'jingdianjieshao', 1607499985636, 1607499270634, '卡尔塔拉火山', 'http://localhost:8080/ssm0wu8j/upload/1607498199031.jpg', 1, 200, 200, 200, 200, 1, '已退款', '江西省赣州市安远县鹤子镇板寮坑');
INSERT INTO `orders` VALUES (1607500090370, '2020-12-09 15:48:09', '20201291548942628591', 'jingdianjieshao', 1607499985636, 1607499270634, '卡尔塔拉火山', 'http://localhost:8080/ssm0wu8j/upload/1607498199031.jpg', 1, 200, 200, 200, 200, 1, '已完成', '江西省赣州市安远县鹤子镇板寮坑');
INSERT INTO `orders` VALUES (1607500129341, '2020-12-09 15:48:48', '202012915484845625909', 'luxiantuijian', 1607499985636, 1607499342610, '卡尔塔火山路线攻略', 'http://localhost:8080/ssm0wu8j/upload/1607499317480.jpg', 1, 200, 200, 200, 200, 1, '已完成', '江西省赣州市安远县鹤子镇板寮坑');
INSERT INTO `orders` VALUES (1607500144906, '2020-12-09 15:49:04', '20201291549473731907', 'tesechanpin', 1607499985636, 1607499454479, '火山灰', 'http://localhost:8080/ssm0wu8j/upload/1607499434856.jpg', 2, 100, 100, 200, 200, 1, '已发货', '江西省赣州市安远县鹤子镇板寮坑');
INSERT INTO `orders` VALUES (1607500177953, '2020-12-09 15:49:36', '202012915493691259601', 'jiudianyuyue', 1607499985636, 1607499608463, '金沙大酒店', 'http://localhost:8080/ssm0wu8j/upload/1607499599557.jpg', 1, 200, 200, 200, 200, 1, '已发货', '江西省赣州市安远县鹤子镇板寮坑');

-- ----------------------------
-- Table structure for storeup
-- ----------------------------
DROP TABLE IF EXISTS `storeup`;
CREATE TABLE `storeup`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) NULL DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500152124 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收藏表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of storeup
-- ----------------------------
INSERT INTO `storeup` VALUES (1607500048455, '2020-12-09 15:47:27', 1607499985636, 1607499270634, 'jingdianjieshao', '卡尔塔拉火山', 'http://localhost:8080/ssm0wu8j/upload/1607498199031.jpg');
INSERT INTO `storeup` VALUES (1607500116858, '2020-12-09 15:48:36', 1607499985636, 1607499342610, 'luxiantuijian', '卡尔塔火山路线攻略', 'http://localhost:8080/ssm0wu8j/upload/1607499317480.jpg');
INSERT INTO `storeup` VALUES (1607500152123, '2020-12-09 15:49:11', 1607499985636, 1607499454479, 'tesechanpin', '火山灰', 'http://localhost:8080/ssm0wu8j/upload/1607499434856.jpg');

-- ----------------------------
-- Table structure for tesechanpin
-- ----------------------------
DROP TABLE IF EXISTS `tesechanpin`;
CREATE TABLE `tesechanpin`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `techanmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '特产名称',
  `techanleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '特产类型',
  `techanguige` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '特产规格',
  `techanzhaopian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '特产照片',
  `techanjieshao` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '特产介绍',
  `xiangqingneirong` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '详情内容',
  `thumbsupnum` int(11) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(11) NULL DEFAULT 0 COMMENT '踩',
  `price` float NOT NULL COMMENT '价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607500487595 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '特色产品' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tesechanpin
-- ----------------------------
INSERT INTO `tesechanpin` VALUES (1, '2020-12-09 12:04:46', '特产名称1', '食品', '特产规格1', 'http://localhost:8080/ssm0wu8j/upload/tesechanpin_techanzhaopian1.jpg', '特产介绍1', '详情内容1', 1, 1, 99.9);
INSERT INTO `tesechanpin` VALUES (2, '2020-12-09 12:04:46', '特产名称2', '食品', '特产规格2', 'http://localhost:8080/ssm0wu8j/upload/tesechanpin_techanzhaopian2.jpg', '特产介绍2', '详情内容2', 2, 2, 99.9);
INSERT INTO `tesechanpin` VALUES (3, '2020-12-09 12:04:46', '特产名称3', '食品', '特产规格3', 'http://localhost:8080/ssm0wu8j/upload/tesechanpin_techanzhaopian3.jpg', '特产介绍3', '详情内容3', 3, 3, 99.9);
INSERT INTO `tesechanpin` VALUES (4, '2020-12-09 12:04:46', '特产名称4', '食品', '特产规格4', 'http://localhost:8080/ssm0wu8j/upload/tesechanpin_techanzhaopian4.jpg', '特产介绍4', '详情内容4', 4, 4, 99.9);
INSERT INTO `tesechanpin` VALUES (5, '2020-12-09 12:04:46', '特产名称5', '食品', '特产规格5', 'http://localhost:8080/ssm0wu8j/upload/tesechanpin_techanzhaopian5.jpg', '特产介绍5', '详情内容5', 5, 5, 99.9);
INSERT INTO `tesechanpin` VALUES (6, '2020-12-09 12:04:46', '特产名称6', '食品', '特产规格6', 'http://localhost:8080/ssm0wu8j/upload/tesechanpin_techanzhaopian6.jpg', '特产介绍6', '详情内容6', 6, 6, 99.9);
INSERT INTO `tesechanpin` VALUES (1607499454479, '2020-12-09 15:37:34', '火山灰', '工艺品', '一斤', 'http://localhost:8080/ssm0wu8j/upload/1607499434856.jpg', '卡尔塔拉火山（Kartala Volcano）是世界上最活跃的火山之一，科摩罗最高山，在莫桑比克海峡北部的大科摩罗岛南部。1900-1965年间曾喷发11次，', '<p><img src=\"http://localhost:8080/ssm0wu8j/upload/1607499452525.jpg\"></p>', 1, 0, 100);
INSERT INTO `tesechanpin` VALUES (1607500487594, '2020-12-09 15:54:47', '海底泥', '食品', '60*60', 'http://localhost:8080/ssm0wu8j/upload/1607500474808.jpeg', '大科摩罗岛的北部为海拔650米的高原，多圆形小丘。南部为卡尔塔拉活火山，海拔2560米，是全国最高峰；火山口直径3.2公里。沿海有狭窄平原，热带湿润气候。居民主要从事农业，产香精作物、椰子、咖啡、薯类等。岛上风光秀丽、海滩绵长，一派热带风光，是旅游的好去处。', '<p><img src=\"http://localhost:8080/ssm0wu8j/upload/1607500485488.jpg\"></p>', 0, 0, 60);

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'token表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 1, 'abo', 'users', '管理员', 'su3ti2yunurvuuqqvk2ej6ujqb4j96pb', '2020-12-09 14:25:02', '2020-12-09 16:51:34');
INSERT INTO `token` VALUES (2, 1607499985636, '555', 'yonghu', '用户', 'igfx1nac5idzjw19yvemzqargj1ezwa6', '2020-12-09 15:46:32', '2020-12-09 16:58:06');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'abo', 'abo', '管理员', '2020-12-09 12:04:47');

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yonghuming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `xingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `nianling` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `lianxidianhua` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `dianziyouxiang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮箱',
  `shenfenzhenghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `gerenzhaopian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '个人照片',
  `money` float NULL DEFAULT 0 COMMENT '余额',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yonghuming`(`yonghuming`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1607499985637 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES (1, '2020-12-09 12:04:46', '001', '001', '姓名1', '男', 1, '13823888881', '773890001@qq.com', '440300199101010001', 'http://localhost:8080/ssm0wu8j/upload/yonghu_gerenzhaopian1.jpg', 100);
INSERT INTO `yonghu` VALUES (2, '2020-12-09 12:04:46', '用户2', '123456', '姓名2', '男', 2, '13823888882', '773890002@qq.com', '440300199202020002', 'http://localhost:8080/ssm0wu8j/upload/yonghu_gerenzhaopian2.jpg', 100);
INSERT INTO `yonghu` VALUES (3, '2020-12-09 12:04:46', '用户3', '123456', '姓名3', '男', 3, '13823888883', '773890003@qq.com', '440300199303030003', 'http://localhost:8080/ssm0wu8j/upload/yonghu_gerenzhaopian3.jpg', 100);
INSERT INTO `yonghu` VALUES (4, '2020-12-09 12:04:46', '用户4', '123456', '姓名4', '男', 4, '13823888884', '773890004@qq.com', '440300199404040004', 'http://localhost:8080/ssm0wu8j/upload/yonghu_gerenzhaopian4.jpg', 100);
INSERT INTO `yonghu` VALUES (5, '2020-12-09 12:04:46', '用户5', '123456', '姓名5', '男', 5, '13823888885', '773890005@qq.com', '440300199505050005', 'http://localhost:8080/ssm0wu8j/upload/yonghu_gerenzhaopian5.jpg', 100);
INSERT INTO `yonghu` VALUES (6, '2020-12-09 12:04:46', '用户6', '123456', '姓名6', '男', 6, '13823888886', '773890006@qq.com', '440300199606060006', 'http://localhost:8080/ssm0wu8j/upload/yonghu_gerenzhaopian6.jpg', 100);
INSERT INTO `yonghu` VALUES (1607499985636, '2020-12-09 15:46:25', '555', '001', '张三', '男', 19, '13800000000', '123@qq.com', '441400000000000000', 'http://localhost:8080/ssm0wu8j/upload/1607500072384.jpg', 9199);

SET FOREIGN_KEY_CHECKS = 1;
