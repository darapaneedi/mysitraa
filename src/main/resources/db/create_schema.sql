-- MySQL Workbench Synchronization
-- Generated: 2016-10-22 12:19
-- Model: Sitraa DB Model
-- Version: 1.0
-- Project: Name of the project

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `MYSITRAA` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`address` (
  `address_id` SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(50) NOT NULL,
  `address2` VARCHAR(50) NULL DEFAULT NULL,
  `district` VARCHAR(20) NOT NULL,
  `city_id` SMALLINT(5) UNSIGNED NOT NULL,
  `postal_code` VARCHAR(10) NULL DEFAULT NULL,
  `phone` VARCHAR(20) NOT NULL,
  `last_update` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`address_id`),
  INDEX `idx_fk_city_id` (`city_id` ASC),
  CONSTRAINT `fk_address_city`
    FOREIGN KEY (`city_id`)
    REFERENCES `MYSITRAA`.`city` (`city_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`city` (
  `city_id` SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(50) NOT NULL,
  `country_id` SMALLINT(5) UNSIGNED NOT NULL,
  `last_update` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`city_id`),
  INDEX `idx_fk_country_id` (`country_id` ASC),
  CONSTRAINT `fk_city_country`
    FOREIGN KEY (`country_id`)
    REFERENCES `MYSITRAA`.`country` (`country_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`country` (
  `country_id` SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(50) NOT NULL,
  `last_update` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`country_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member` (
  `customer_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(50) NULL DEFAULT NULL,
  `address_id` SMALLINT(5) UNSIGNED NOT NULL,
  `no_of_kids` INT(11) NULL DEFAULT NULL,
  `active` TINYINT(1) NOT NULL DEFAULT TRUE,
  `no_of_adults` INT(11) NULL DEFAULT NULL,
  `member_photo` BLOB NULL DEFAULT NULL,
  `create_date` DATETIME NOT NULL,
  `last_update` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`customer_id`),
  INDEX `idx_fk_address_id` (`address_id` ASC),
  INDEX `idx_last_name` (`last_name` ASC),
  CONSTRAINT `fk_customer_address`
    FOREIGN KEY (`address_id`)
    REFERENCES `MYSITRAA`.`address` (`address_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'Table storing all customers. Holds foreign keys to the address table and the store table where this customer is registered.\n\nBasic information about the customer like first and last name are stored in the table itself. Same for the date the record was created and when the information was last updated.';

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`MemberProvider` (
  `member_provider_id` INT(10) UNSIGNED NOT NULL,
  `provider_name` VARCHAR(45) NULL DEFAULT NULL,
  `provider_address1` VARCHAR(45) NULL DEFAULT NULL,
  `provider_address2` VARCHAR(45) NULL DEFAULT NULL,
  `provider_city` VARCHAR(45) NULL DEFAULT NULL,
  `provider_zip` VARCHAR(45) NULL DEFAULT NULL,
  `provider_country` VARCHAR(45) NULL DEFAULT NULL,
  `npi` INT(11) NULL DEFAULT NULL,
  `medicare` INT(11) NULL DEFAULT NULL,
  `medicaid` INT(11) NULL DEFAULT NULL,
  `provider_speciality` VARCHAR(45) NULL DEFAULT NULL,
  `provider_portal` VARCHAR(45) NULL DEFAULT NULL,
  `member_emr_uid` VARCHAR(45) NULL DEFAULT NULL,
  `member_emr_pwd` VARCHAR(45) NULL DEFAULT NULL,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `last_update` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_provider_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`Anthropometrics` (
  `Anthropometrics_id` INT(10) UNSIGNED NOT NULL,
  `customer_id` INT(10) UNSIGNED NOT NULL,
  `date_of_exam` DATETIME NOT NULL,
  `height` INT(11) NOT NULL,
  `weight` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NOT NULL,
  `sex` VARCHAR(45) NOT NULL,
  `waist_size` INT(11) NOT NULL,
  `calculated_bmi` INT(11) NOT NULL,
  `overall_health` VARCHAR(45) NULL DEFAULT NULL,
  `ordered_by_physician` INT(11) NOT NULL,
  `last_update` DATETIME NOT NULL,
  PRIMARY KEY (`Anthropometrics_id`),
  INDEX `ordered_by_physician_idx` (`ordered_by_physician` ASC),
  CONSTRAINT `ordered_by_physician`
    FOREIGN KEY (`ordered_by_physician`)
    REFERENCES `MYSITRAA`.`MemberProvider` (`member_provider_id`)
    ON DELETE RESTRICT
    ON UPDATE NO ACTION,
  CONSTRAINT `customer_id`
    FOREIGN KEY ()
    REFERENCES `MYSITRAA`.`member` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`labwork_urine` (
  `labwork_id` INT(11) NOT NULL AUTO_INCREMENT,
  `customer_id` VARCHAR(45) NOT NULL,
  `u_color` VARCHAR(45) NULL DEFAULT NULL,
  `u_glucose` VARCHAR(45) NULL DEFAULT NULL,
  `u_bilirubin` VARCHAR(45) NULL DEFAULT NULL,
  `u_ketone` VARCHAR(45) NULL DEFAULT NULL,
  `u_spec_grav` INT(11) NULL DEFAULT NULL,
  `u_blood` VARCHAR(45) NULL DEFAULT NULL,
  `u_ph` INT(11) NULL DEFAULT NULL,
  `u_protein` VARCHAR(45) NULL DEFAULT NULL,
  `u_urobilinogen` INT(11) NULL DEFAULT NULL,
  `u_nitrite` VARCHAR(45) NULL DEFAULT NULL,
  `u_leuk_esterase` VARCHAR(45) NULL DEFAULT NULL,
  `u_microscopic_ind` VARCHAR(45) NULL DEFAULT NULL,
  `u_rbc` VARCHAR(45) NULL DEFAULT NULL,
  `u_wbc` VARCHAR(45) NULL DEFAULT NULL,
  `u_epithelial_cells` VARCHAR(45) NULL DEFAULT NULL,
  `u_bacteria` VARCHAR(45) NULL DEFAULT NULL,
  `labwork_urinecol` VARCHAR(45) NULL DEFAULT NULL,
  `date_of_exam` DATETIME NULL DEFAULT NULL,
  `provider_id` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`labwork_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`first_name`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_medical_cond` (
  `mem_medcond_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `condition_diag` VARCHAR(45) NULL DEFAULT NULL,
  `condition_diag_date` DATETIME NULL DEFAULT NULL,
  `member_provider_id` INT(11) NULL DEFAULT NULL,
  `condition_mgmt_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`mem_medcond_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  INDEX `condition_mgmt_id_idx` (`condition_mgmt_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `condition_mgmt_id`
    FOREIGN KEY (`condition_mgmt_id`)
    REFERENCES `MYSITRAA`.`diseases_mgmt` (`diseases_mgmt_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`diseases_mgmt` (
  `diseases_mgmt_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `diseases_name` VARCHAR(45) NULL DEFAULT NULL,
  `create_date` DATETIME NULL DEFAULT NULL,
  `last_update` DATETIME NULL DEFAULT NULL,
  `diag_cd` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`diseases_mgmt_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`labwork_blood` (
  `idlabwork_blood_id` INT(11) NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NOT NULL,
  `date_of_exam` DATETIME NULL DEFAULT NULL,
  `glucose` INT(11) NULL DEFAULT NULL,
  `uric_acid` INT(11) NULL DEFAULT NULL,
  `urea_nitrogen` INT(11) NULL DEFAULT NULL,
  `creatinine_serum` INT(11) NULL DEFAULT NULL,
  `bun_creatinine_ratio` INT(11) NULL DEFAULT NULL,
  `glomerular_egfr` INT(11) NULL DEFAULT NULL,
  `protein` INT(11) NULL DEFAULT NULL,
  `albumin_serum` INT(11) NULL DEFAULT NULL,
  `globulin_total` INT(11) NULL DEFAULT NULL,
  `albumin_globulin_ratio` INT(11) NULL DEFAULT NULL,
  `bilrubin_total` INT(11) NULL DEFAULT NULL,
  `alkaline_phosphatase` INT(11) NULL DEFAULT NULL,
  `aspartate_aminotransferase` INT(11) NULL DEFAULT NULL,
  `alanine_amino` INT(11) NULL DEFAULT NULL,
  `lactate_dehydrogenase` INT(11) NULL DEFAULT NULL,
  `gct` INT(11) NULL DEFAULT NULL,
  `sodium_serum` INT(11) NULL DEFAULT NULL,
  `potassium` INT(11) NULL DEFAULT NULL,
  `chloride` INT(11) NULL DEFAULT NULL,
  `carbon_dioxide` INT(11) NULL DEFAULT NULL,
  `cholestrol` INT(11) NULL DEFAULT NULL,
  `triglycerides` INT(11) NULL DEFAULT NULL,
  `hdl` INT(11) NULL DEFAULT NULL,
  `ldl` INT(11) NULL DEFAULT NULL,
  `hdl_ratio` INT(11) NULL DEFAULT NULL,
  `wbc` INT(11) NULL DEFAULT NULL,
  `rbc` INT(11) NULL DEFAULT NULL,
  `hemoglobin` INT(11) NULL DEFAULT NULL,
  `iron` INT(11) NULL DEFAULT NULL,
  `physician_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`idlabwork_blood_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  INDEX `physician_id_idx` (`physician_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `physician_id`
    FOREIGN KEY (`physician_id`)
    REFERENCES `MYSITRAA`.`MemberProvider` (`member_provider_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_diet_pref` (
  `member_diet_pref_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `vegan` CHAR(1) NULL DEFAULT NULL,
  `vegeterian` CHAR(1) NULL DEFAULT NULL,
  `meat` CHAR(1) NULL DEFAULT NULL,
  `poultry` CHAR(1) BINARY NULL DEFAULT NULL,
  `sodium_res_diet` CHAR(1) NULL DEFAULT NULL,
  `low_carb_diet` CHAR(1) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_diet_pref_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_allergens` (
  `member_allergens_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `allergens_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `date_reported` DATETIME NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_allergens_id`),
  INDEX `allergens_id_idx` (`allergens_id` ASC),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `allergens_id`
    FOREIGN KEY (`allergens_id`)
    REFERENCES `MYSITRAA`.`allergens_type` (`allergens_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`allergens_type` (
  `allergens_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `allergens_type` VARCHAR(45) NULL DEFAULT NULL,
  `allergens_desc` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`allergens_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_cultural_pref` (
  `member_cultural_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `cultural_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_cultural_id`),
  INDEX `cultural_id_idx` (`cultural_id` ASC),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `cultural_id`
    FOREIGN KEY (`cultural_id`)
    REFERENCES `MYSITRAA`.`cultural_type` (`cultural_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`cultural_type` (
  `cultural_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `culture_name` VARCHAR(45) NULL DEFAULT NULL,
  `culture_desc` VARCHAR(45) NULL DEFAULT NULL,
  `culture_meat` CHAR(1) NULL DEFAULT NULL,
  `culture_dairy` CHAR(1) NULL DEFAULT NULL,
  `culture_veggies` CHAR(1) NULL DEFAULT NULL,
  `culture_gluten` CHAR(1) NULL DEFAULT NULL,
  `cultural_eggs` CHAR(1) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`cultural_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_eating_habits` (
  `member_eating_habits_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `breakfast_ndays` INT(11) NULL DEFAULT NULL,
  `breakfast_healthy_scale` INT(11) NULL DEFAULT NULL,
  `lunch_ndays` INT(11) NULL DEFAULT NULL,
  `lunch_healthy_scale` INT(11) NULL DEFAULT NULL,
  `dinner_ndays` INT(11) NULL DEFAULT NULL,
  `dinner_healthy_scale` INT(11) NULL DEFAULT NULL,
  `water_oz` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_eating_habits_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_drugs` (
  `member_drugs_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `drug_name` VARCHAR(45) NULL DEFAULT NULL,
  `drug_strength` INT(11) NULL DEFAULT NULL,
  `diseases_mgmt_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `drug_usage_per_week` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_drugs_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  INDEX `diseases_mgmt_id_idx` (`diseases_mgmt_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `diseases_mgmt_id`
    FOREIGN KEY (`diseases_mgmt_id`)
    REFERENCES `MYSITRAA`.`diseases_mgmt` (`diseases_mgmt_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_actviity` (
  `member_actviity_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `activity_level_scale_1to5` INT(11) NULL DEFAULT NULL,
  `activity_freq` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_actviity_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_tracking_devices` (
  `member_tracking_devices_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `device_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `device_usage_scale` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_tracking_devices_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  INDEX `device_id_idx` (`device_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `device_id`
    FOREIGN KEY (`device_id`)
    REFERENCES `MYSITRAA`.`device_type` (`device_type_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`device_type` (
  `device_type_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `device_name` VARCHAR(45) NULL DEFAULT NULL,
  `device_description` VARCHAR(45) NULL DEFAULT NULL,
  `device_manufacturer` VARCHAR(45) NULL DEFAULT NULL,
  `device_version` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`device_type_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_retail` (
  `member_retail_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `all_retail_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `purchase_freq_permontth` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_retail_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  INDEX `all_retail_id_idx` (`all_retail_id` ASC, `customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `all_retail_id`
    FOREIGN KEY (`all_retail_id` , `customer_id`)
    REFERENCES `MYSITRAA`.`all_retail` (`all_retail_id` , `all_retail_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`all_retail` (
  `all_retail_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `retail_name` VARCHAR(45) NULL DEFAULT NULL,
  `retail_type` VARCHAR(45) NULL DEFAULT NULL,
  `retail_descritption` VARCHAR(45) NULL DEFAULT NULL,
  `retail_location` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`all_retail_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_receipt` (
  `retail_member_receipts_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `date_of_receipt` DATETIME NULL DEFAULT NULL,
  `retailer_id` VARCHAR(45) NULL DEFAULT NULL,
  `receip_image` BLOB NULL DEFAULT NULL,
  `uploaded_via` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` TIME NULL DEFAULT NULL,
  PRIMARY KEY (`retail_member_receipts_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_receipes` (
  `member_receipes_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `receipe_name` VARCHAR(45) NULL DEFAULT NULL,
  `receipe_description` VARCHAR(45) NULL DEFAULT NULL,
  `receipe_url` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_receipes_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_receipe_Ing` (
  `member_receipe_Ing_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_receipes_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `ingredient_name` VARCHAR(45) NULL DEFAULT NULL,
  `ingredient_desc` VARCHAR(45) NULL DEFAULT NULL,
  `ingredient_quan` INT(11) NULL DEFAULT NULL,
  `quantity_unit` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_receipe_Ing_id`),
  CONSTRAINT `member_receipes_id`
    FOREIGN KEY (`member_receipe_Ing_id`)
    REFERENCES `MYSITRAA`.`member_receipes` (`member_receipes_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`Dietitian` (
  `dietitian_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(50) NULL DEFAULT NULL,
  `address_id` SMALLINT(5) UNSIGNED NOT NULL,
  `active` TINYINT(1) NOT NULL DEFAULT TRUE,
  `create_date` DATETIME NOT NULL,
  `last_update` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`dietitian_id`),
  INDEX `idx_fk_address_id` (`address_id` ASC),
  INDEX `idx_last_name` (`last_name` ASC),
  CONSTRAINT `fk_customer_address0`
    FOREIGN KEY (`address_id`)
    REFERENCES `MYSITRAA`.`address` (`address_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'Table storing all customers. Holds foreign keys to the address table and the store table where this customer is registered.\n\nBasic information about the customer like first and last name are stored in the table itself. Same for the date the record was created and when the information was last updated.';

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_education_ug` (
  `dietitian_education_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `undergrad_degreee` VARCHAR(45) NULL DEFAULT NULL,
  `undergrad_university` VARCHAR(45) NULL DEFAULT NULL,
  `undergrad_gpa` INT(11) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_education_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_expertise` (
  `dietitian_expertise_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` VARCHAR(45) NULL DEFAULT NULL,
  `behavioral_health` CHAR(1) NULL DEFAULT NULL,
  `oncology_nutrition` CHAR(1) NULL DEFAULT NULL,
  `childhood_obseity` CHAR(1) NULL DEFAULT NULL,
  `culinary_arts` CHAR(1) NULL DEFAULT NULL,
  `digestive_disorder` CHAR(1) NULL DEFAULT NULL,
  `eating_disorder` CHAR(1) NULL DEFAULT NULL,
  `food_allergies` CHAR(1) NULL DEFAULT NULL,
  `general_nutrition` CHAR(1) NULL DEFAULT NULL,
  `gernotology_nutrition` CHAR(1) NULL DEFAULT NULL,
  `gluten_intolerence` CHAR(1) NULL DEFAULT NULL,
  `heart_health` CHAR(1) NULL DEFAULT NULL,
  `home_health_care` CHAR(1) NULL DEFAULT NULL,
  `functional_nutrition` CHAR(1) NULL DEFAULT NULL,
  `kidney_Renal_nutrition` CHAR(1) NULL DEFAULT NULL,
  `lactation` CHAR(1) NULL DEFAULT NULL,
  `maternal_nutrition` CHAR(1) NULL DEFAULT NULL,
  `immune_nutrition` CHAR(1) NULL DEFAULT NULL,
  `pediatric_nutrition` CHAR(1) NULL DEFAULT NULL,
  `sports_nutrition` CHAR(1) NULL DEFAULT NULL,
  `vegetarian_nutrition` CHAR(1) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_expertise_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`first_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`hospital_affiliations` (
  `hospital_affiliations_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dieitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `hospital_name` VARCHAR(45) NULL DEFAULT NULL,
  `hospital_address` VARCHAR(45) NULL DEFAULT NULL,
  `designation` VARCHAR(45) NULL DEFAULT NULL,
  `date_of_join` DATETIME NULL DEFAULT NULL,
  `provider_id` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`hospital_affiliations_id`),
  INDEX `dietitian_id_idx` (`dieitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dieitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`cultural_competencies` (
  `cultural_competencies_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `cultural_name` VARCHAR(45) NULL DEFAULT NULL,
  `culture_des` VARCHAR(45) NULL DEFAULT NULL,
  `culture_exp_lev1to5` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`cultural_competencies_id`),
  INDEX `dieitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dieitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_preferences` (
  `dietitian_preferences_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `patient_sex_perf` CHAR(1) NULL DEFAULT NULL,
  `diseases_mgmt_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `dietitian_language_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `perf_start_date` DATETIME NULL DEFAULT NULL,
  `cultural_competencied_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_preferences_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  INDEX `diseases_mgmt_id_idx` (`diseases_mgmt_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `diseases_mgmt_id`
    FOREIGN KEY (`diseases_mgmt_id`)
    REFERENCES `MYSITRAA`.`diseases_mgmt` (`diseases_mgmt_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `dietitian_language_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`dietitan_languages` (`dietitan_languages_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `cultural_competencied_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`cultural_competencies` (`cultural_competencies_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitan_languages` (
  `dietitan_languages_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `language_name` VARCHAR(45) NULL DEFAULT NULL,
  `language_region` VARCHAR(45) NULL DEFAULT NULL,
  `exp_lvl_1to5` INT(11) ZEROFILL NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitan_languages_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_education_g` (
  `dietitian_education_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `grad_degreee` VARCHAR(45) NULL DEFAULT NULL,
  `grad_university` VARCHAR(45) NULL DEFAULT NULL,
  `grad_gpa` INT(11) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_education_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_education_certification` (
  `dietitian_education_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `certfication_name` VARCHAR(45) NULL DEFAULT NULL,
  `certification_desc` VARCHAR(45) NULL DEFAULT NULL,
  `license_number` VARCHAR(45) NULL DEFAULT NULL,
  `certification_gpa` INT(11) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_education_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_allocation` (
  `dietitian_allocation_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `allocation_month` VARCHAR(45) NULL DEFAULT NULL,
  `allocation_percentage` INT(11) NULL DEFAULT NULL,
  `overtime_limit` INT(11) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_allocation_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_schedule` (
  `dietitian_schedule_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `dayofweek` VARCHAR(45) NULL DEFAULT NULL,
  `schedule_start` INT(11) NULL DEFAULT NULL,
  `schedule_end` INT(11) NULL DEFAULT NULL,
  `add_schedule_start` INT(11) NULL DEFAULT NULL,
  `add_schedule_end` INT(11) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_schedule_id`),
  INDEX `dietitan_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitan_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_timekeeper` (
  `dietitian_timekeeper_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `month` INT(11) NULL DEFAULT NULL,
  `day` INT(11) NULL DEFAULT NULL,
  `year` INT(11) NULL DEFAULT NULL,
  `hours_logged` INT(11) NULL DEFAULT NULL,
  `approved_by` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_timekeeper_id`),
  INDEX `dietitian_id_idx` (`dietitian_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dietitian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`dietitian_billing` (
  `dietitian_billing_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dieititian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `member_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `billing_week` INT(11) NULL DEFAULT NULL,
  `billing_hours` INT(11) NULL DEFAULT NULL,
  `dieititian_notes` VARCHAR(150) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`dietitian_billing_id`),
  INDEX `dietitian_id_idx` (`dieititian_id` ASC),
  INDEX `member_id_idx` (`member_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`dieititian_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `member_id`
    FOREIGN KEY (`member_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`mem_diet_sugg_articles` (
  `mem_diet_sugg_articles_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `member_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `dietitian_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `article_url` VARCHAR(45) NULL DEFAULT NULL,
  `article_upload` BLOB NULL DEFAULT NULL,
  `article_valid_from` DATETIME NULL DEFAULT NULL,
  `article_valid_to` DATETIME NULL DEFAULT NULL,
  `article_header` VARCHAR(45) NULL DEFAULT NULL,
  `artcile_desc` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt_user` VARCHAR(45) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`mem_diet_sugg_articles_id`),
  INDEX `dietitian_id_idx` (`member_id` ASC),
  CONSTRAINT `dietitian_id`
    FOREIGN KEY (`member_id`)
    REFERENCES `MYSITRAA`.`Dietitian` (`dietitian_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `member_id`
    FOREIGN KEY (`member_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_medical_cond_fly` (
  `mem_medcond_flyid` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `condition_diag_fly` VARCHAR(45) NULL DEFAULT NULL,
  `condition_diag_date` DATETIME NULL DEFAULT NULL,
  `member_provider_id` INT(11) NULL DEFAULT NULL,
  `condition_mgmt_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`mem_medcond_flyid`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  INDEX `condition_mgmt_id_idx` (`condition_mgmt_id` ASC),
  CONSTRAINT `customer_id0`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `condition_mgmt_id0`
    FOREIGN KEY (`condition_mgmt_id`)
    REFERENCES `MYSITRAA`.`diseases_mgmt` (`diseases_mgmt_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`lifestyle_mgmt` (
  `lifestyle_mgmt_id` INT(10) UNSIGNED NOT NULL,
  `customer_id` INT(10) UNSIGNED NOT NULL,
  `Driving_miles` INT(11) NULL DEFAULT NULL,
  `motorcycle_yn` VARCHAR(45) NULL DEFAULT NULL,
  `speedlimit` INT(11) NULL DEFAULT NULL,
  `exercise_avgweek` INT(11) NULL DEFAULT NULL,
  `social_ties` INT(11) NULL DEFAULT NULL,
  `tense_depressed_anx` INT(11) NULL DEFAULT NULL,
  `main_health_complains` VARCHAR(45) NULL DEFAULT NULL,
  `weight_mgmt_gain` CHAR(1) NULL DEFAULT NULL,
  `weight_mgmt_reduce` CHAR(1) NULL DEFAULT NULL,
  `stress_level` INT(11) NULL DEFAULT NULL,
  `stress_cause` VARCHAR(45) NULL DEFAULT NULL,
  `stress_relieve_msc` VARCHAR(45) NULL DEFAULT NULL,
  `sleep_mgmt_hrs` INT(11) NULL DEFAULT NULL,
  `sleep_happy_yn` CHAR(1) NULL DEFAULT NULL,
  `sleep_awake_yn` CHAR(1) NULL DEFAULT NULL,
  `smoke_yn` CHAR(1) NULL DEFAULT NULL,
  `smoke_ever_yn` CHAR(1) NULL DEFAULT NULL,
  `medication_drugs_freq` INT(11) NULL DEFAULT NULL,
  `alchol_freq` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`lifestyle_mgmt_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `MYSITRAA`.`member_goals` (
  `member_goals_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `customer_id` INT(10) UNSIGNED NOT NULL,
  `goal_date` DATETIME NULL DEFAULT NULL,
  `weight_mgmt` INT(11) NULL DEFAULT NULL,
  `diet_nutrition` INT(11) NULL DEFAULT NULL,
  `fitness` INT(11) NULL DEFAULT NULL,
  `alchol_usage` INT(11) NULL DEFAULT NULL,
  `tobacco_usage` INT(11) NULL DEFAULT NULL,
  `last_updt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`member_goals_id`),
  INDEX `customer_id_idx` (`customer_id` ASC),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `MYSITRAA`.`member` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
