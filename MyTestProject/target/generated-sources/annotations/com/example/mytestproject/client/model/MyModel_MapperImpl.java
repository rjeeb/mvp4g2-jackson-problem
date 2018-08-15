package com.example.mytestproject.client.model;

import java.lang.Override;
import org.dominokit.jacksonapt.AbstractObjectMapper;
import org.dominokit.jacksonapt.JsonDeserializer;
import org.dominokit.jacksonapt.JsonSerializer;

public final class MyModel_MapperImpl extends AbstractObjectMapper<MyModel> {
  public MyModel_MapperImpl() {
    super("MyModel");
  }

  @Override
  protected JsonDeserializer<MyModel> newDeserializer() {
    return new MyModelBeanJsonDeserializerImpl();
  }

  @Override
  protected JsonSerializer<?> newSerializer() {
    return new MyModelBeanJsonSerializerImpl();
  }
}
