create table `payment` (
  `id` bigint(20) not null auto_increment,
  `serial` varchar(200) default '',
  primary key(`id`)
) engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;