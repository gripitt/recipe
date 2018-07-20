package com.nicholaslocicero.focus.reciplee.model.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import com.nicholaslocicero.focus.reciplee.model.entity.Ingredient;
import com.nicholaslocicero.focus.reciplee.model.entity.ShoppingItem;
import java.util.List;

@Dao
public interface ShoppingItemDao {

  @Insert
  long insert(ShoppingItem shoppingItem);

  @Insert
  List<Long> insert(ShoppingItem... shoppingItems);

  @Insert
  List<Long> insert(List<ShoppingItem> shoppingItems);

  @Query("SELECT * FROM shopping_list")
  List<ShoppingItem> select();
}
