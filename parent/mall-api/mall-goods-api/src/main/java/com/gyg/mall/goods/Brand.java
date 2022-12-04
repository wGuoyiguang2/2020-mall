package com.gyg.mall.goods;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: mallproject
 * @description:
 * @author: gyg
 * @create: 2021-05-15 12:26
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "brand")
public class Brand {


    @TableId
   private Integer id ;
   private String   name ;
   private String image ;
   private String  initial ;
   private Integer sort ;
}
    
    