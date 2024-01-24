package data;

import entity.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


public interface Data {
    static List<Categories> categoriesData() {
        return List.of(
                Categories.builder()
                        .name_categories("Smartphones")
                        .description("Choose from our range of smart phones with elegant style and advanced technology." +
                                " Discover new possibilities with the perfect combination of design and functionality.")
                        .build(),

                Categories.builder()
                        .name_categories("Computers")
                        .description("Open a world of new possibilities with our computers – power, elegance and reliability for the most demanding tasks. " +
                                "Make your work and entertainment environment perfect.")
                        .build(),

                Categories.builder()
                        .name_categories("Laptops")
                        .description("Wing your productivity with our laptops: stylish design, " +
                                "impressive performance and flawless mobility – the perfect companion for your life and work.")
                        .build(),

                Categories.builder()
                        .name_categories("Accessories for laptops and PCs")
                        .description("Enhance your workspace with our best laptop and PC accessories." +
                                " Choose style and function for convenience and elegance.")
                        .build(),

                Categories.builder()
                        .name_categories("Appliances for the home")
                        .description("\n" +
                                "Elevate your living with our curated collection of home appliances. " +
                                "From cutting-edge technology to stylish designs, discover appliances that blend seamlessly with your lifestyle for a more comfortable and efficient home.")
                        .build(),

                Categories.builder()
                        .name_categories("Kitchen appliances")
                        .description("Transform your kitchen into a culinary haven with our premium kitchen appliances. Experience innovation and style as you cook, bake, and entertain with ease." +
                                " Elevate your culinary journey with our exquisite range of appliances.")
                        .build(),

                Categories.builder()
                        .name_categories("For gamers")
                        .description("Level up your gaming experience with our high-performance gaming gear." +
                                " Immerse yourself in precision, speed, and style with our cutting-edge gaming peripherals and accessories." +
                                " Unleash the gamer in you and dominate every virtual battlefield.")
                        .build()

        );

    }

    static List<Provider> providerData() {
        return List.of(
                Provider.builder()
                        .name_company("TechGadgets Ltd.")
                        .country("United States")
                        .build(),

                Provider.builder()
                        .name_company("InnovateTech Co.")
                        .country("Canada")
                        .build(),

                Provider.builder()
                        .name_company("SmartElectronics GmbH")
                        .country("Germany")
                        .build(),

                Provider.builder()
                        .name_company("EpicTech Solutions")
                        .country("United Kingdom")
                        .build(),

                Provider.builder()
                        .name_company("GamingGear Pro")
                        .country("Japan")
                        .build()
        );
    }

    static List<Product> productsData(List<Categories> categories, List<Provider> providers) {
        return List.of(
                Product.builder()
                        .name_product("Lenovo IdeaPad Gaming 3 16ARH7 Onyx Gray laptop")
                        .description("Screen\n" +
                                "Display diagonal\n" +
                                "16\"\n" +
                                " \n" +
                                "Display resolution\n" +
                                "1920 x 1200\n" +
                                " \n" +
                                "Matrix type\n" +
                                "IPS\n" +
                                " \n" +
                                "Screen refresh rate\n" +
                                "165 Hz\n" +
                                " \n" +
                                "Display coverage\n" +
                                "anti-glare\n" +
                                " \n" +
                                "Screen brightness\n" +
                                "350 knots\n" +
                                " \n" +
                                "Screen Features\n" +
                                "100% sRGB, FreeSync" +
                                "Processor\n" +
                                "Processor Series\n" +
                                "AMD Ryzen 5 / Ryzen 5 Pro\n" +
                                " \n" +
                                "Processor model\n" +
                                "6600H\n" +
                                " \n" +
                                "CPU base frequency\n" +
                                "3.3GHz\n" +
                                " \n" +
                                "Number of cores\n" +
                                "6" +
                                "Video card\n" +
                                "Video card type\n" +
                                "discrete\n" +
                                " \n" +
                                "Video card manufacturer\n" +
                                "NVIDIA\n" +
                                " \n" +
                                "Video card model\n" +
                                "GeForce RTX 3050\n" +
                                " \n" +
                                "Volume of video memory\n" +
                                "4")
                        .price(36999)
                        .categories(Set.of(
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("Laptops"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("Computers"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("For gamers"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .stock_quality(12)
                        .providers(Set.of(
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("TechGadgets Ltd."))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("InnovateTech Co."))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .build(),
                Product.builder()
                        .name_product("HyperX Cloud Alpha Gaming Headset")
                        .description("Sound\n" +
                                "Frequency range of the headphone\n" +
                                "13-27000 Hz\n" +
                                " \n" +
                                "Headphone sensitivity\n" +
                                "98 dB\n" +
                                " \n" +
                                "Headphone impedance\n" +
                                "65 Ohm\n" +
                                "Microphone\n" +
                                "Frequency range of the microphone\n" +
                                "50-18000 Hz\n" +
                                " \n" +
                                "Microphone sensitivity\n" +
                                "-43dB\n" +
                                "Operation\n" +
                                "Wire connections\n" +
                                "plug 3.5 mm\n" +
                                " \n" +
                                "Connection connectors\n" +
                                "3.5 mm")
                        .price(4999)
                        .categories(Set.of(
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("For gamers"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("Accessories for laptops and PCs"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .stock_quality(8)
                        .providers(Set.of(
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("GamingGear Pro"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .build(),
                Product.builder()
                        .name_product("APPLE iPhone 15 Pro Max 256GB Natural Titanium")
                        .description("The main ones\n" +
                                "Trademark\n" +
                                "APPLE\n" +
                                " \n" +
                                "Device type\n" +
                                "smartphone\n" +
                                " \n" +
                                "Graduation year\n" +
                                "2023\n" +
                                " \n" +
                                "Operating System\n" +
                                "iOS\n" +
                                " \n" +
                                "Operating system version\n" +
                                "17\n" +
                                " \n" +
                                "Apple model range\n" +
                                "iPhone 15 Pro Max\n" +
                                "Connection\n" +
                                "Internet\n" +
                                "3G; 4G (LTE); 5G\n" +
                                " \n" +
                                "Number of SIM cards\n" +
                                "1 + eSIM\n" +
                                " \n" +
                                "SIM card type\n" +
                                "Nano-SIM; eSIM\n" +
                                "Screen\n" +
                                "Display diagonal\n" +
                                "6.7\"\n" +
                                " \n" +
                                "Matrix\n" +
                                "OLED Super Retina XDR\n" +
                                " \n" +
                                "resolution\n" +
                                "2796x1290\n" +
                                " \n" +
                                "Screen refresh rate\n" +
                                "120 Hz\n" +
                                " \n" +
                                "Pixels per inch\n" +
                                "460\n" +
                                "Processor\n" +
                                "Processor + video chip\n" +
                                "Apple A17 Pro Bionic\n" +
                                " \n" +
                                "Number of cores\n" +
                                "6\n" +
                                " \n" +
                                "The maximum frequency of the processor\n" +
                                "3.46GHz\n" +
                                "Memory\n" +
                                "Built-in memory, GB\n" +
                                "256\n" +
                                " \n" +
                                "RAM, GB\n" +
                                "8\n" +
                                " \n" +
                                "Memory card support\n" +
                                "is not supported\n" +
                                "Main camera\n" +
                                "Main camera\n" +
                                "48MP\n" +
                                " \n" +
                                "The second module (main camera)\n" +
                                "12MP\n" +
                                " \n" +
                                "The third module (main camera)\n" +
                                "12MP\n" +
                                " \n" +
                                "The maximum resolution of the recorded video\n" +
                                "2160p@60fps\n" +
                                "Front camera\n" +
                                "Front camera\n" +
                                "12MP\n" +
                                "Wireless technologies\n" +
                                "Communications\n" +
                                "GPS; Wi-Fi; Bluetooth; NFC; USB Type-C\n" +
                                " \n" +
                                "Bluetooth version\n" +
                                "5.3\n" +
                                "Battery\n" +
                                "Battery type\n" +
                                "Li-Ion\n" +
                                " \n" +
                                "Charging technology\n" +
                                "wireless charging; fast charging\n" +
                                " \n" +
                                "Playing music\n" +
                                "95 hours\n" +
                                " \n" +
                                "Video playback\n" +
                                "29 hours\n" +
                                "Corps\n" +
                                "Features\n" +
                                "triple camera; protected housing\n" +
                                " \n" +
                                "Sensors\n" +
                                "compass; gyroscope; barometer; light sensor; accelerometer; LiDAR scanner; proximity sensor\n" +
                                " \n" +
                                "Security\n" +
                                "facial recognition\n" +
                                " \n" +
                                "Color\n" +
                                "gray\n" +
                                " \n" +
                                "Back cover material\n" +
                                "glass\n" +
                                " \n" +
                                "Corps\n" +
                                "indecipherable\n" +
                                " \n" +
                                "Protection standard\n" +
                                "IP68\n" +
                                "Dimensions\n" +
                                "Size\n" +
                                "159.9 x 76.7 x 8.25 mm\n" +
                                " \n" +
                                "Weight\n" +
                                "221")
                        .price(60499)
                        .stock_quality(12)
                        .categories(Set.of(
                                categories.stream().filter(category -> category.getName_categories().equals("Smartphones"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .providers(Set.of(
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("TechGadgets Ltd."))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("InnovateTech Co."))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .build(),
                Product.builder()
                        .name_product("Computer super")
                        .description("Main characteristics\n" +
                                "Class\n" +
                                "gamer\n" +
                                " \n" +
                                "Chipset\n" +
                                "PRIME B650M-A\n" +
                                " \n" +
                                "Processor series\n" +
                                "AMD Ryzen 5\n" +
                                " \n" +
                                "Processor model\n" +
                                "7600\n" +
                                " \n" +
                                "Number of cores\n" +
                                "6\n" +
                                " \n" +
                                "Frequency\n" +
                                "3.8 GHz\n" +
                                " \n" +
                                "Memory type\n" +
                                "DDR5\n" +
                                " \n" +
                                "RAM volume\n" +
                                "32 GB\n" +
                                " \n" +
                                "Memory frequency\n" +
                                "6000\n" +
                                " \n" +
                                "Drive type\n" +
                                "SSD; HDD\n" +
                                " \n" +
                                "Hard disk volume\n" +
                                "2000 GB\n" +
                                " \n" +
                                "The volume of the SSD|eMMC disk\n" +
                                "480 GB\n" +
                                " \n" +
                                "Video card type\n" +
                                "discrete\n" +
                                " \n" +
                                "Video card manufacturer\n" +
                                "NVIDIA\n" +
                                " \n" +
                                "Video card model\n" +
                                "GeForce RTX4070\n" +
                                " \n" +
                                "The amount of video memory\n" +
                                "12")
                        .price(234567)
                        .categories(Set.of(
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("Laptops"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("Computers"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .stock_quality(12)
                        .providers(Set.of(
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("SmartElectronics GmbH"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("EpicTech Solutions"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .build(),
                Product.builder()
                        .name_product("SAMSUNG refrigerator")
                        .description("Main characteristics\n" +
                                "\n" +
                                "Type of refrigerator\n" +
                                "two-chambered\n" +
                                " \n" +
                                "Freezers\n" +
                                "bottom location\n" +
                                " \n" +
                                "Defrosting system\n" +
                                "No Frost\n" +
                                " \n" +
                                "Defrosting the freezer\n" +
                                "No Frost\n" +
                                " \n" +
                                "Power consumption class\n" +
                                "A+\n" +
                                " \n" +
                                "Total volume\n" +
                                "400 liters\n" +
                                " \n" +
                                "General purpose volume\n" +
                                "385 liters\n" +
                                " \n" +
                                "Useful volume of the refrigerating chamber\n" +
                                "273 liters\n" +
                                " \n" +
                                "Useful volume of the freezer\n" +
                                "112 liters\n" +
                                " \n" +
                                "Management\n" +
                                "sensory\n" +
                                "Specifications\n" +
                                "Compressor type\n" +
                                "inverter\n" +
                                " \n" +
                                "Color\n" +
                                "black\n" +
                                " \n" +
                                "Climate class\n" +
                                "N; SN; T; St\n" +
                                " \n" +
                                "Electricity consumption per year\n" +
                                "320kWh/Year\n" +
                                " \n" +
                                "Number of compressors\n" +
                                "1\n" +
                                " \n" +
                                "Refrigerant\n" +
                                "R600a\n" +
                                " \n" +
                                "Freezing capacity per day\n" +
                                "12 kg\n" +
                                " \n" +
                                "Technical features\n" +
                                "protection against voltage drops; zone of freshness; multi-flow cooling system; supercooling; \"Vacation\" mode; overhung doors; display; door ajar notification\n" +
                                "\n" +
                                "Dimensions and weight\n" +
                                "\n" +
                                "Height\n" +
                                "203 cm\n" +
                                " \n" +
                                "Width\n" +
                                "59.5 cm\n" +
                                " \n" +
                                "Depth\n" +
                                "65.8 cm\n" +
                                " \n" +
                                "Dimensions in the package\n" +
                                "210.8 x 63.7 x 74 cm\n" +
                                " \n" +
                                "Package weight\n" +
                                "73 kg\n" +
                                " \n" +
                                "Weight without packaging\n" +
                                "70 kg\n")
                        .price(29099)
                        .categories(Set.of(
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("Appliances for the home"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new),
                                categories.stream()
                                        .filter(category -> category.getName_categories().equals("Kitchen appliances"))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .stock_quality(12)
                        .providers(Set.of(
                                providers.stream()
                                        .filter(provider -> provider.getName_company().equals("InnovateTech Co."))
                                        .findFirst()
                                        .orElseThrow(IllegalArgumentException::new)))
                        .build()
        );
    }

    static List<BonusPoints> BonusPointsData() {
        return List.of(
                BonusPoints.builder()
                        .points(245)
                        .build(),
                BonusPoints.builder()
                        .points(100)
                        .build(),
                BonusPoints.builder()
                        .points(50)
                        .build(),
                BonusPoints.builder()
                        .points(150)
                        .build()
        );
    }


    static List<User> usersData(List<BonusPoints> bonusPoints) {
        return List.of(
                User.builder()
                        .name("Alex")
                        .password("dgdgdfdbfdb")
                        .email("dfgds@gmail.com")
                        .Date(LocalDate.of(2004, 10, 12))
                        .total_amount_buy(24547)
                        .bonusPoints(BonusPoints.builder()
                                .points(245)
                                .build())
                        .build(),
                User.builder()
                        .name("John")
                        .password("password123")
                        .email("john@gmail.com")
                        .Date(LocalDate.of(1995, 5, 20))
                        .total_amount_buy(10000)
                        .bonusPoints(BonusPoints.builder()
                                .points(100)
                                .build())
                        .build(),


                User.builder()
                        .name("Alice")
                        .password("qwerty")
                        .email("alice@gmail.com")
                        .Date(LocalDate.of(2000, 8, 3))
                        .total_amount_buy(5000)
                        .bonusPoints(BonusPoints.builder()
                                .points(50)
                                .build())
                        .build(),

                User.builder()
                        .name("Bob")
                        .password("bobpassword")
                        .email("bob@gmail.com")
                        .Date(LocalDate.of(1990, 12, 1))
                        .total_amount_buy(15000)
                        .bonusPoints(BonusPoints.builder()
                                .points(150)
                                .build())
                        .build()
        );
    }

    static List<Orders> ordersData(List<User> customers, List<Product> products) {
        return List.of(
                Orders.builder()
                        .user(customers.stream()
                                .filter(customer -> customer.getName().equals("Bob"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .order_date(LocalDate.of(2023, 5, 20))
                        .order_status("Придбано")
                        .product(products.stream()
                                .filter(product -> product.getName_product().equals("HyperX Cloud Alpha Gaming Headset"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .build(),

                Orders.builder()
                        .user(customers.stream()
                                .filter(customer -> customer.getName().equals("Alice"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .order_date(LocalDate.of(2023, 7, 20))
                        .order_status("Надіслано")
                        .product(products.stream()
                                .filter(product -> product.getName_product().equals("APPLE iPhone 15 Pro Max 256GB Natural Titanium"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .build()
        );


    }
    static List<Favorites> favoritesData(List<User> customers, List<Product> products) {
        return List.of(
                Favorites.builder()
                        .user(customers.stream()
                                .filter(customer -> customer.getName().equals("Bob"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .product(products.stream()
                                .filter(product -> product.getName_product().equals("HyperX Cloud Alpha Gaming Headset"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .build(),

                Favorites.builder()
                        .user(customers.stream()
                                .filter(customer -> customer.getName().equals("Alice"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .product(products.stream()
                                .filter(product -> product.getName_product().equals("APPLE iPhone 15 Pro Max 256GB Natural Titanium"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .build()
        );


    }
    static List<Reviews> rewiewsData(List<User> customers, List<Product> products) {
        return List.of(
                Reviews.builder()
                        .user(customers.stream()
                                .filter(customer -> customer.getName().equals("Bob"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .rating(5)
                        .comment("Круті навушнкии !")
                        .product(products.stream()
                                .filter(product -> product.getName_product().equals("HyperX Cloud Alpha Gaming Headset"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .build(),

                Reviews.builder()
                        .user(customers.stream()
                                .filter(customer -> customer.getName().equals("Alice"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .rating(3)
                        .comment("Досих пір не прийшов товар ")
                        .product(products.stream()
                                .filter(product -> product.getName_product().equals("APPLE iPhone 15 Pro Max 256GB Natural Titanium"))
                                .findFirst()
                                .orElseThrow(IllegalArgumentException::new))
                        .build()
        );
    }
        static List<ShoppingCart> shoppingCartsData() {
            return List.of(
                    ShoppingCart.builder()
                            .quantity(1)
                            .date(LocalDate.of(2023, 7, 20))
                            .build()
            );
        }

    }
















