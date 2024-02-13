CREATE TABLE `parent` (
  `parent_id` int(11) NOT NULL,
  `parent_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci

CREATE TABLE `child_first` (
  `child_first_id` int(11) NOT NULL,
  `parent_id` int(11) NOT NULL,
  `child_first_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`child_first_id`),
  KEY `parent_id` (`parent_id`),
  CONSTRAINT `child_first_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `parent` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci

CREATE TABLE `child_second` (
  `child_second_id` int(11) NOT NULL,
  `parent_id` int(11) NOT NULL,
  `child_second_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`child_second_id`),
  KEY `parent_id` (`parent_id`),
  CONSTRAINT `child_second_ibfk_1` FOREIGN KEY (`parent_id`) REFERENCES `parent` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci