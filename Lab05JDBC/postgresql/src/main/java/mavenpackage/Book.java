
package mavenpackage;

/*
 *    CREATE TABLE Books ( 
 *       title CHAR(60), 
 *       isbn CHAR(13) PRIMARY KEY,
 *       publisher_id INT, 
 *       price DECIMAL(10,2), 
 *       constraint FKpublisher FOREIGN KEY (publisher_id) REFERENCES Publishers (publisher_id)
 *    );
 */

public class Book {

   private String title;
   private String isbn;
   private int publisherId;
   private float price;

   public String getTitle() { return this.title; }
   public void setTitle(String title) { this.title = title; }

   public String getIsbn() { return this.isbn; }
   public void setIsbn(String isbn) { this.isbn = isbn; }

   public int getPublisherId() { return this.publisherId; }
   public void setPublisherId(int publisherId) { this.publisherId = publisherId; }

   public float getPrice() { return this.price; }
   public void setPrice(float price) { this.price = price; }
}
