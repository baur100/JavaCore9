package modelsHW;


import enums.Status;

public class PetHW {
    private long id;
    private String name;
    private String[]photoUrls;
    private Status status;
    private CategoryHW category;
    private TagHW[] tags;

    public PetHW(String name, String[] photoUrls) {
        this.name = name;
        this.photoUrls = photoUrls;
    }

    public long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public CategoryHW getCategoryHW() {
        return category;
    }

    public TagHW[] getTags() {
        return tags;
    }

    public String getName() {
        return name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCategoryHW(CategoryHW categoryHW) {
        this.category = categoryHW;
    }

    public void setTags(TagHW[] tags) {
        this.tags = tags;
    }

}
