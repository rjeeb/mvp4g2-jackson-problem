package com.example.mytestproject.client.model;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.dominokit.jacksonapt.JacksonContextProvider;
import org.dominokit.jacksonapt.JsonDeserializationContext;
import org.dominokit.jacksonapt.JsonDeserializer;
import org.dominokit.jacksonapt.JsonDeserializerParameters;
import org.dominokit.jacksonapt.deser.StringJsonDeserializer;
import org.dominokit.jacksonapt.deser.bean.AbstractBeanJsonDeserializer;
import org.dominokit.jacksonapt.deser.bean.BeanPropertyDeserializer;
import org.dominokit.jacksonapt.deser.bean.HasDeserializerAndParameters;
import org.dominokit.jacksonapt.deser.bean.Instance;
import org.dominokit.jacksonapt.deser.bean.InstanceBuilder;
import org.dominokit.jacksonapt.deser.bean.MapLike;
import org.dominokit.jacksonapt.stream.JsonReader;

public final class MyModelBeanJsonDeserializerImpl extends AbstractBeanJsonDeserializer<MyModel> {
  public MyModelBeanJsonDeserializerImpl() {
  }

  @Override
  public Class getDeserializedType() {
    return MyModel.class;
  }

  @Override
  protected InstanceBuilder<MyModel> initInstanceBuilder() {
    final MapLike<HasDeserializerAndParameters> deserializers = null;
    return new InstanceBuilder<MyModel>() {
      @Override
      public Instance<MyModel> newInstance(JsonReader reader, JsonDeserializationContext ctx,
          JsonDeserializerParameters params, Map<String, String> bufferedProperties,
          Map<String, Object> bufferedPropertiesValues) {
        return new Instance<MyModel>(create(), bufferedProperties);
      }

      @Override
      public MapLike<HasDeserializerAndParameters> getParametersDeserializer() {
        return deserializers;
      }

      private MyModel create() {
        return new MyModel();
      }
    };
  }

  @Override
  protected MapLike<BeanPropertyDeserializer<MyModel, ?>> initDeserializers() {
    MapLike<BeanPropertyDeserializer<MyModel, ?>> map = JacksonContextProvider.get().mapLikeFactory().make();
    map.put("uuid", new BeanPropertyDeserializer<MyModel, String>() {
      @Override
      protected JsonDeserializer<?> newDeserializer() {
        return StringJsonDeserializer.getInstance();
      }

      @Override
      public void setValue(MyModel bean, String value, JsonDeserializationContext ctx) {
        bean.uuid=value;
      }
    });
    map.put("activeScreen", new BeanPropertyDeserializer<MyModel, String>() {
      @Override
      protected JsonDeserializer<?> newDeserializer() {
        return StringJsonDeserializer.getInstance();
      }

      @Override
      public void setValue(MyModel bean, String value, JsonDeserializationContext ctx) {
        bean.setActiveScreen(value);
      }
    });
    return map;
  }
}
