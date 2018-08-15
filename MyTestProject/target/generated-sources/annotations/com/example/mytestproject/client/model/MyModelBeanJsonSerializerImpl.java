package com.example.mytestproject.client.model;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.dominokit.jacksonapt.JsonSerializationContext;
import org.dominokit.jacksonapt.JsonSerializer;
import org.dominokit.jacksonapt.ser.StringJsonSerializer;
import org.dominokit.jacksonapt.ser.bean.AbstractBeanJsonSerializer;
import org.dominokit.jacksonapt.ser.bean.BeanPropertySerializer;

public final class MyModelBeanJsonSerializerImpl extends AbstractBeanJsonSerializer<MyModel> {
  public MyModelBeanJsonSerializerImpl() {
  }

  @Override
  public Class getSerializedType() {
    return MyModel.class;
  }

  @Override
  protected BeanPropertySerializer[] initSerializers() {
    BeanPropertySerializer[] result = new BeanPropertySerializer[2];
    result[0] = new BeanPropertySerializer<MyModel, String>("uuid") {
      @Override
      protected JsonSerializer<?> newSerializer() {
        return StringJsonSerializer.getInstance();
      }

      @Override
      public String getValue(MyModel bean, JsonSerializationContext ctx) {
        return bean.getUuid();
      }
    };
    result[1] = new BeanPropertySerializer<MyModel, String>("activeScreen") {
      @Override
      protected JsonSerializer<?> newSerializer() {
        return StringJsonSerializer.getInstance();
      }

      @Override
      public String getValue(MyModel bean, JsonSerializationContext ctx) {
        return bean.getActiveScreen();
      }
    };
    return result;
  }
}
