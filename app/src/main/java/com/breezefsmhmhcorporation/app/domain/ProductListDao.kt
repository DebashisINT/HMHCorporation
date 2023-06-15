package com.breezefsmhmhcorporation.app.domain

import androidx.room.*
import com.breezefsmhmhcorporation.app.AppConstant
import com.breezefsmhmhcorporation.features.login.model.productlistmodel.ProductListDataModel
import com.breezefsmhmhcorporation.features.viewAllOrder.orderOptimized.CommonProductCatagory
import com.breezefsmhmhcorporation.features.viewAllOrder.orderOptimized.CustomProductRate

/**
 * Created by Saikat on 08-11-2018.
 */
@Dao
interface ProductListDao {

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE)
    fun getAll(): List<ProductListEntity>
    
    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE +" where id IN (SELECT id FROM product_list group by brand)")
    fun getUniqueBrandList(): List<ProductListEntity>

    @Query("SELECT product_name FROM " + AppConstant.PRODUCT_LIST_TABLE)
    fun getNameAll(): List<String>

    ////nw code new
    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate1 as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_rate) as PR\n" +
            "on PL.id = PR.product_id ")
    fun getCustomizeProductListAll(): List<CustomProductRate>


    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_online_rate_temp_table) as PR\n" +
            "on PL.id = PR.product_id ")
    fun getCustomizeProductListAllFromOnline(): List<CustomProductRate>
    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate1 as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_rate) as PR\n" +
            "on PL.id = PR.product_id and brand_id=:brand_id")
    fun getCustomizeProductListByBeandID(brand_id:String): List<CustomProductRate>

    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_online_rate_temp_table) as PR\n" +
            "on PL.id = PR.product_id and brand_id=:brand_id")
    fun getCustomizeProductListByBeandIDFromOnlineRate(brand_id:String): List<CustomProductRate>

    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate1 as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_rate) as PR\n" +
            "on PL.id = PR.product_id and brand_id=:brand_id and category_id=:category_id")
    fun getCustomizeProductListByBeandIDCategoryID(brand_id:String, category_id: String): List<CustomProductRate>

    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_online_rate_temp_table) as PR\n" +
            "on PL.id = PR.product_id and brand_id=:brand_id and category_id=:category_id")
    fun getCustomizeProductListByBeandIDCategoryIDFromOnlineRate(brand_id:String, category_id: String): List<CustomProductRate>

    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate1 as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_rate) as PR\n" +
            "on PL.id = PR.product_id and brand_id=:brand_id and category_id=:category_id and watt_id=:watt_id")
    fun getCustomizeProductListByBeandIDCategoryIDWattID(brand_id:String, category_id: String,watt_id: String): List<CustomProductRate>

    @Query("select PL.id as product_id,PL.product_name,PL.brand_id,PL.brand,PL.category_id,PL.category,PL.watt_id,PL.watt,PL.product_mrp_show," +
            "PL.product_discount_show,PR.rate as rate from \n" +
            "(select * from product_list) as PL\n" +
            "inner JOIN\n" +
            "(select * from product_online_rate_temp_table) as PR\n" +
            "on PL.id = PR.product_id and brand_id=:brand_id and category_id=:category_id and watt_id=:watt_id")
    fun getCustomizeProductListByBeandIDCategoryIDWattIDFromOnlineRate(brand_id:String, category_id: String,watt_id: String): List<CustomProductRate>

    @Query("select DISTINCT  brand_id as id_sel,brand as name_sel from product_list")
    fun getDistinctBrandList(): List<CommonProductCatagory>

    @Query("select DISTINCT category_id as id_sel,category as name_sel from product_list where brand_id =:brand_id ")
    fun getDistinctCategoryList(brand_id:String): List<CommonProductCatagory>

    @Query("SELECT DISTINCT watt_id as id_sel,watt as name_sel FROM product_list where brand_id=:brand_id and category_id=:category_id ")
    fun getDistinctWattList(brand_id:String,category_id:String): List<CommonProductCatagory>

    @Query("SELECT DISTINCT watt_id as id_sel,watt as name_sel FROM product_list where brand_id=:brand_id ")
    fun getDistinctWattList1(brand_id:String): List<CommonProductCatagory>
    ////nw code end




    @Query("SELECT Distinct(brand) FROM " + AppConstant.PRODUCT_LIST_TABLE + " order by brand")
    fun getBrandList(): List<String>

    @Query("SELECT Distinct(brand) FROM " + AppConstant.PRODUCT_LIST_TABLE + " where category=:category COLLATE NOCASE")
    fun getBrandListAccordingToCategory(category: String): List<String>

    @Query("SELECT Distinct(category) FROM " + AppConstant.PRODUCT_LIST_TABLE)
    fun getCategoryList(): List<String>

    @Query("SELECT Distinct(category) FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand COLLATE NOCASE order by category")
    fun getCategoryListAccordingToBrand(brand: String): List<String>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id and id IN (SELECT id FROM product_list group by category) COLLATE NOCASE order by category")
    fun getCategoryListAccordingToBrandId(brand_id: String): List<ProductListEntity>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand and category=:category COLLATE NOCASE")
    fun getAllValueAccordingToCategoryBrand(brand: String, category: String): List<ProductListEntity>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id and category_id=:category_id COLLATE NOCASE")
    fun getAllValueAccordingToCategoryBrandId(brand_id: String, category_id: String): List<ProductListEntity>

    /*@Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand and category=:category order by cast(watt as int)")
    fun getAllValueAccordingToCategoryBrandFilteredByWatt(brand: String, category: String): List<ProductListEntity>*/

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand and category=:category and watt=:watt COLLATE NOCASE")
    fun getAllValueAccordingToCategoryBrandFilteredByWatt(brand: String, category: String, watt: String): List<ProductListEntity>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id and category_id=:category_id and watt_id=:watt_id COLLATE NOCASE")
    fun getAllValueAccordingToCategoryBrandFilteredByWattId(brand_id: String, category_id: String, watt_id: String): List<ProductListEntity>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand COLLATE NOCASE")
    fun getAllValueAccordingToBrand(brand: String): List<ProductListEntity>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id COLLATE NOCASE")
    fun getAllValueAccordingToBrandId(brand_id: String): List<ProductListEntity>

    /*@Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand order by cast(watt as int)")
    fun getAllValueAccordingToBrandWattWise(brand: String): List<ProductListEntity>*/

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand and watt=:watt COLLATE NOCASE")
    fun getAllValueAccordingToBrandWattWise(brand: String, watt: String): List<ProductListEntity>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id and watt_id=:watt_id  COLLATE NOCASE")
    fun getAllValueAccordingToBrandWattIdWise(brand_id: String, watt_id: String): List<ProductListEntity>

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where category=:category")
    fun getAllValueAccordingToCategory(category: String): List<ProductListEntity>

    @Query("SELECT Distinct(watt) FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand COLLATE NOCASE")
    fun getWattListBrandWise(brand: String): List<String>

    /*@Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id and id IN (SELECT id FROM product_list group by watt) COLLATE NOCASE")
    fun getWattListBrandIdWise(brand_id: String): List<ProductListEntity>*/

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id COLLATE NOCASE group by watt")
    fun getWattListBrandIdWise(brand_id: String): List<ProductListEntity>

    @Query("SELECT Distinct(watt) FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand=:brand and category=:category COLLATE NOCASE")
    fun getWattListBrandCategoryWise(brand: String, category: String): List<String>

    /*@Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id  and category_id=:category_id and " +
            "id IN (SELECT id FROM product_list group by watt) COLLATE NOCASE")
    fun getWattListBrandCategoryIdWise(brand_id: String, category_id: String): List<ProductListEntity>*/

    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE + " where brand_id=:brand_id  and category_id=:category_id COLLATE NOCASE group by watt")
    fun getWattListBrandCategoryIdWise(brand_id: String, category_id: String): List<ProductListEntity>

    @Query("DELETE FROM " + AppConstant.PRODUCT_LIST_TABLE)
    fun deleteAllProduct()

    @Insert
    fun insert(vararg leaveType: ProductListEntity)

/*    @Insert
    fun insertAll(vararg product_list: ArrayList<ProductListEntity>)*/

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @JvmSuppressWildcards
    abstract fun insertAll(kist: List<ProductListEntity>)


    @Query("SELECT * FROM " + AppConstant.PRODUCT_LIST_TABLE +" where id=:id")
    fun getSingleProduct(id: Int): ProductListEntity



}