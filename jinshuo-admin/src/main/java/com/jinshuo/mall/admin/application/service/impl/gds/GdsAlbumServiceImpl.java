package com.jinshuo.mall.admin.application.service.impl.gds;

import com.github.pagehelper.PageInfo;
import com.jinshuo.mall.admin.application.service.gds.IGdsAlbumService;
import com.jinshuo.mall.admin.domain.gds.GdsAlbum;
import com.jinshuo.mall.admin.infra.mapper.gds.GdsAlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *  服务层实现
 * 
 * @author dyh
 * @date 2020-08-12
 */
@Service
public class GdsAlbumServiceImpl implements IGdsAlbumService
{
	@Autowired(required = false)
	private GdsAlbumMapper gdsAlbumMapper;

	/**
     * 查询信息
     * 
     * @param id ID
     * @return 信息
     */
	public GdsAlbum selectGdsAlbumById(Long id)
	{
	    return gdsAlbumMapper.selectGdsAlbumById(id);
	}
	
	/**
     * 查询列表
     * 
     * @param qry 信息
     * @return 集合
     */
	public PageInfo selectGdsAlbumPage(GdsAlbum qry)
	{
        /*PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
		GdsAlbum gdsAlbum = new GdsAlbum();
        List<GdsAlbum> gdsAlbums = gdsAlbumMapper.selectGdsAlbumList(gdsAlbum);
        PageInfo pageInfo = new PageInfo(gdsAlbums);
	    return pageInfo;*/
		return null;
	}
	
    /**
     * 新增
     * 
     * @param gdsAlbum 信息
     * @return 结果
     */
	public int insertGdsAlbum(GdsAlbum gdsAlbum)
	{
		gdsAlbum.preInsert();
	    return gdsAlbumMapper.insertGdsAlbum(gdsAlbum);
	}
	
	/**
     * 修改
     * 
     * @param gdsAlbum 信息
     * @return 结果
     */
	public int updateGdsAlbum(GdsAlbum gdsAlbum)
	{
	    gdsAlbum.preUpdate();
	    return gdsAlbumMapper.updateGdsAlbum(gdsAlbum);
	}

	/**
     * 删除对象
     * 
     * @param id 需要删除的数据ID
     * @return 结果
     */
	public int deleteGdsAlbumById(Long id)
	{
		return gdsAlbumMapper.deleteGdsAlbumById(id);
	}
	
}
