/**
 * Blockchain.com Exchange REST API
 * ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account Select API from the drop down menu Fill out form and click “Create New API Key Now” Once generated you can view your keys under API Settings 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.blockchain.exchange.rest.model;

import com.blockchain.exchange.rest.model.PriceEvent;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PriceEventList {
  
  @SerializedName("orders")
  private List<PriceEvent> orders = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<PriceEvent> getOrders() {
    return orders;
  }
  public void setOrders(List<PriceEvent> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceEventList priceEventList = (PriceEventList) o;
    return (this.orders == null ? priceEventList.orders == null : this.orders.equals(priceEventList.orders));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orders == null ? 0: this.orders.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceEventList {\n");
    
    sb.append("  orders: ").append(orders).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}