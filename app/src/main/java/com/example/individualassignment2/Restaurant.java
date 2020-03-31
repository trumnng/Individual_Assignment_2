package com.example.individualassignment2;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cuisine;
    private String description;
    private String location;
    private double rating;

    public Restaurant() {

    }

    //Constructor for Restaurant Class
    public Restaurant(String name, String cuisine, String description, String location, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.description = description;
        this.location = location;
        this.rating = rating;
    }

    //Getters for each of the declared variables in the Restaurant Class
    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    //Setters for each of the declared variables in the Restaurant Class
    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating (double rating) {
        this.rating = rating;
    }

    public static ArrayList<Restaurant> getRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Sokyo", "Japanese", "Head Chef Chase Kojima and his team use the finest local produce to create an imaginative menu of sashimi, tempura and melt-in-the-mouth meats cooked over the robata grill. And with its own fusion of uber-cool ambience and eclectic energy, Sokyo is an experience unlike any other.", "Level G, The Darling The Star/80 Pyrmont Street, Pyrmont NSW 2009", 4.9));
        restaurants.add(new Restaurant("Restaurant Hubert", "French, European", "Hubert is a French restaurant located in the heart of downtown Sydney. We are open for lunch Thursday to Friday, and dinner through to late night supper Monday to Saturday.", "15 Bligh St, Sydney NSW 2000", 4.9));
        restaurants.add(new Restaurant("Gelato Messina", "Italian", "At Gelato Messina our job is to make people happy. Yes we make amazing gelato with the very best, real ingredients. And yes our gelato cakes are weird and wonderful, but it’s all in the name of putting a smile on someone’s face.", "283 Church St, Parramatta NSW 2150", 4.9));
        restaurants.add(new Restaurant("Bourke Street Bakery", "Australian", "Bourke Street Bakery is your neighbourhood bakery. We pride ourselves on making real food from the best ingredients, the old fashioned way – by hand, with dedication and love.", "633 Bourke Street, Surry Hills, Sydney", 4.9));
        restaurants.add(new Restaurant("Cow & The Moon", "Italian", "Cow and the Moon is a good old fashioned family run business with a focus on artisan gelato with exceptional, creative, balanced flavours.  The passionate crew at Cow and the Moon are all about quality gelato and ethically sourced coffee. Since opening in 2010, Cow and the Moon has been a well loved local spot for the Enmore locals.", "181 Enmore Road, Enmore, Sydney", 4.9));
        restaurants.add(new Restaurant("Bennelong Restaurant", "Australian", "Bennelong showcases the diversity of Australian cuisine within the shell of one of Australia’s most iconic buildings. Our concept takes advantage of Bennelong’s multi-level layout by presenting different dining options including; À la carte, Cured & Cultured and Bennelong Bar.", "Sydney Opera House, Bennelong Point, CBD, Sydney", 4.9));
        restaurants.add(new Restaurant("LuMi Bar & Dining", "Japanese, Italian", "Beneath a multitude of pendent lights creating an intimate atmosphere, LuMi Dining comes to life under the guidance of Chef Federico Zanellato and his wife and Sommelier Michela. LuMi offers a casual fine dining experience.", "56 Pirrama Road, Pyrmont, Pyrmont, Sydney", 4.9));
        restaurants.add(new Restaurant("The Baxter Inn", "Australian", "Sophisticated bar featuring an extensive selection of top-shelf whiskies, plus classic cocktails.", "Basement, 152-156 Clarence Street, CBD, Sydney", 4.9));
        restaurants.add(new Restaurant("Mappen Noodle Restaurant", "Japanese", "A retro Japanese self-serve rice and noodle bar featuring udon and soba soups, tempura and toppings.", "Shop 11, Skyview Shopping Plaza, 537-551 George Street, CBD, Sydney", 4.8));
        restaurants.add(new Restaurant("Café Cre Asion ", "Japanese", "Having opened in 2011, owner Yu Sasaki, is dedicated to bringing a small slice of Japan here to Sydney through mouth-watering matcha desserts and baked sweets. If you’re not a sweet tooth however, Yu makes delicious toasted savoury sandwiches, which are filled with fresh and locally-sourced ingredients.", "101/21 Alberta Street, CBD, Sydney", 4.8));
        return restaurants;
    }

}



