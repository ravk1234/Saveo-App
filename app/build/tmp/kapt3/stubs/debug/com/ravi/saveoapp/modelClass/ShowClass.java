package com.ravi.saveoapp.modelClass;

import java.lang.System;

@javax.annotation.Generated(value = {"com.robohorse.robopojogenerator"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00fd\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0013\u0010D\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010G\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010L\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010P\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0086\u0002\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010W\u001a\u00020\u0007H\u00d6\u0001J\t\u0010X\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b\'\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b5\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b;\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b=\u0010!\u00a8\u0006Y"}, d2 = {"Lcom/ravi/saveoapp/modelClass/ShowClass;", "", "summary", "", "image", "Lcom/ravi/saveoapp/modelClass/ImageClass;", "averageRuntime", "", "links", "Lcom/ravi/saveoapp/modelClass/LinksClass;", "premiered", "rating", "Lcom/ravi/saveoapp/modelClass/RatingClass;", "runtime", "weight", "language", "type", "url", "officialSite", "network", "Lcom/ravi/saveoapp/modelClass/NetworkClass;", "schedule", "Lcom/ravi/saveoapp/modelClass/ScheduleClass;", "genres", "", "name", "id", "externals", "Lcom/ravi/saveoapp/modelClass/ExternalsClass;", "updated", "status", "(Ljava/lang/String;Lcom/ravi/saveoapp/modelClass/ImageClass;Ljava/lang/Integer;Lcom/ravi/saveoapp/modelClass/LinksClass;Ljava/lang/String;Lcom/ravi/saveoapp/modelClass/RatingClass;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravi/saveoapp/modelClass/NetworkClass;Lcom/ravi/saveoapp/modelClass/ScheduleClass;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lcom/ravi/saveoapp/modelClass/ExternalsClass;Ljava/lang/Integer;Ljava/lang/String;)V", "getAverageRuntime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExternals", "()Lcom/ravi/saveoapp/modelClass/ExternalsClass;", "getGenres", "()Ljava/util/List;", "getId", "getImage", "()Lcom/ravi/saveoapp/modelClass/ImageClass;", "getLanguage", "()Ljava/lang/String;", "getLinks", "()Lcom/ravi/saveoapp/modelClass/LinksClass;", "getName", "getNetwork", "()Lcom/ravi/saveoapp/modelClass/NetworkClass;", "getOfficialSite", "getPremiered", "getRating", "()Lcom/ravi/saveoapp/modelClass/RatingClass;", "getRuntime", "getSchedule", "()Lcom/ravi/saveoapp/modelClass/ScheduleClass;", "getStatus", "getSummary", "getType", "getUpdated", "getUrl", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/ravi/saveoapp/modelClass/ImageClass;Ljava/lang/Integer;Lcom/ravi/saveoapp/modelClass/LinksClass;Ljava/lang/String;Lcom/ravi/saveoapp/modelClass/RatingClass;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ravi/saveoapp/modelClass/NetworkClass;Lcom/ravi/saveoapp/modelClass/ScheduleClass;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lcom/ravi/saveoapp/modelClass/ExternalsClass;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ravi/saveoapp/modelClass/ShowClass;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ShowClass {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "summary")
    private final java.lang.String summary = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "image")
    private final com.ravi.saveoapp.modelClass.ImageClass image = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "averageRuntime")
    private final java.lang.Integer averageRuntime = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "_links")
    private final com.ravi.saveoapp.modelClass.LinksClass links = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "premiered")
    private final java.lang.String premiered = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rating")
    private final com.ravi.saveoapp.modelClass.RatingClass rating = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private final java.lang.Integer runtime = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weight")
    private final java.lang.Integer weight = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "language")
    private final java.lang.String language = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "type")
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "url")
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "officialSite")
    private final java.lang.String officialSite = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "network")
    private final com.ravi.saveoapp.modelClass.NetworkClass network = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "schedule")
    private final com.ravi.saveoapp.modelClass.ScheduleClass schedule = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private final java.util.List<java.lang.String> genres = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "externals")
    private final com.ravi.saveoapp.modelClass.ExternalsClass externals = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated")
    private final java.lang.Integer updated = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ravi.saveoapp.modelClass.ShowClass copy(@org.jetbrains.annotations.Nullable()
    java.lang.String summary, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.ImageClass image, @org.jetbrains.annotations.Nullable()
    java.lang.Integer averageRuntime, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.LinksClass links, @org.jetbrains.annotations.Nullable()
    java.lang.String premiered, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.RatingClass rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer weight, @org.jetbrains.annotations.Nullable()
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String officialSite, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.NetworkClass network, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.ScheduleClass schedule, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.ExternalsClass externals, @org.jetbrains.annotations.Nullable()
    java.lang.Integer updated, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ShowClass() {
        super();
    }
    
    public ShowClass(@org.jetbrains.annotations.Nullable()
    java.lang.String summary, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.ImageClass image, @org.jetbrains.annotations.Nullable()
    java.lang.Integer averageRuntime, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.LinksClass links, @org.jetbrains.annotations.Nullable()
    java.lang.String premiered, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.RatingClass rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer runtime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer weight, @org.jetbrains.annotations.Nullable()
    java.lang.String language, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String officialSite, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.NetworkClass network, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.ScheduleClass schedule, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> genres, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    com.ravi.saveoapp.modelClass.ExternalsClass externals, @org.jetbrains.annotations.Nullable()
    java.lang.Integer updated, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.ImageClass component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.ImageClass getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAverageRuntime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.LinksClass component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.LinksClass getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPremiered() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.RatingClass component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.RatingClass getRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOfficialSite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.NetworkClass component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.NetworkClass getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.ScheduleClass component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.ScheduleClass getSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.ExternalsClass component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ravi.saveoapp.modelClass.ExternalsClass getExternals() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
}