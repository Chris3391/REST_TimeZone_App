package com.SamTaskApp.SamTaskApp.dto;


public class TimeZoneDTO {
    private Data data;

    public TimeZoneDTO() {
    }

    public TimeZoneDTO(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TimeZoneDTO{" +
                "data=" + data +
                '}';
    }

    public static class Data {

        private Timezone timezone;

        public Data () {
        }

        public Data(Timezone timezone) {
            this.timezone = timezone;
        }

        public Timezone getTimezone() {
            return timezone;
        }

        public void setTimezone(Timezone timezone) {
            this.timezone = timezone;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + timezone + '\'' +
                    '}';
        }
    }

    public static class Timezone {
        private String id;
        private String location;
        private String country_code;
        private String country_name;
        private String iso3166_1_alpha_2;
        private String iso3166_1_alpha_3;
        private String un_m49_code;
        private String itu;
        private String marc;
        private String wmo;
        private String ds;
        private String phone_prefix;

        public Timezone() {
        }

        public Timezone(String id, String location, String country_code, String country_name, String iso3166_1_alpha_2, String iso3166_1_alpha_3, String un_m49_code, String itu, String marc, String wmo, String ds, String phone_prefix, String fifa, String fips, String gual, String ioc, String currency_alpha_code, String currency_country_name, String currency_minor_unit, String currency_name, String currency_code, String independent, String capital, String continent, String tld, String languages, String geoname_id, String edgar) {
            this.id = id;
            this.location = location;
            this.country_code = country_code;
            this.country_name = country_name;
            this.iso3166_1_alpha_2 = iso3166_1_alpha_2;
            this.iso3166_1_alpha_3 = iso3166_1_alpha_3;
            this.un_m49_code = un_m49_code;
            this.itu = itu;
            this.marc = marc;
            this.wmo = wmo;
            this.ds = ds;
            this.phone_prefix = phone_prefix;

        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public String getIso3166_1_alpha_2() {
            return iso3166_1_alpha_2;
        }

        public void setIso3166_1_alpha_2(String iso3166_1_alpha_2) {
            this.iso3166_1_alpha_2 = iso3166_1_alpha_2;
        }

        public String getIso3166_1_alpha_3() {
            return iso3166_1_alpha_3;
        }

        public void setIso3166_1_alpha_3(String iso3166_1_alpha_3) {
            this.iso3166_1_alpha_3 = iso3166_1_alpha_3;
        }

        public String getUn_m49_code() {
            return un_m49_code;
        }

        public void setUn_m49_code(String un_m49_code) {
            this.un_m49_code = un_m49_code;
        }

        public String getItu() {
            return itu;
        }

        public void setItu(String itu) {
            this.itu = itu;
        }

        public String getMarc() {
            return marc;
        }

        public void setMarc(String marc) {
            this.marc = marc;
        }

        public String getWmo() {
            return wmo;
        }

        public void setWmo(String wmo) {
            this.wmo = wmo;
        }

        public String getDs() {
            return ds;
        }

        public void setDs(String ds) {
            this.ds = ds;
        }

        public String getPhone_prefix() {
            return phone_prefix;
        }

        public void setPhone_prefix(String phone_prefix) {
            this.phone_prefix = phone_prefix;
        }

        @Override
        public String toString() {
            return "TimeZone{" +
                    "id='" + id + '\'' +
                    ", location='" + location + '\'' +
                    ", country_code='" + country_code + '\'' +
                    ", country_name='" + country_name + '\'' +
                    ", iso3166_1_alpha_2='" + iso3166_1_alpha_2 + '\'' +
                    ", iso3166_1_alpha_3='" + iso3166_1_alpha_3 + '\'' +
                    ", un_m49_code='" + un_m49_code + '\'' +
                    ", itu='" + itu + '\'' +
                    ", marc='" + marc + '\'' +
                    ", wmo='" + wmo + '\'' +
                    ", ds='" + ds + '\'' +
                    ", phone_prefix='" + phone_prefix + '\'' +
                    '}';
        }
    }
}
